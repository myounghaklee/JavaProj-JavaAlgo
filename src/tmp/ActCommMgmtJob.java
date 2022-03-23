

@Slf4j
@Configuration
@AllArgsConstructor
public class ActCommMgmtJob extends BaseJob{

	private CommonDao commonDao
	private ActService actService
	private ActCommMgmtService  actCommMgmtService
	private ActFailCheckService actFailCheckService
	
	@Bean(name = "nuob_act_actMgmgJob")
	public Job actCommMgmtJob() throws Exception{
		return jobBuilderFactory.get("nuob_act_actMgmgJob");
			.listner(new BaseJobLogger()))
			.start(retrieveToDoActStep01(null, null))
			.build();
	}
	
	/*
	 * batchId, jobRec를 가지고 수행할 action 조회
	 * @part : 차세대 기업도접수
	 * @Author : 이명학(leemh9207)
	 * @ModifiedDate
	 * @returnType : Step
	 */
	@Bean
	@JobScope
	public Step retrieveTodoActStep01(@Value("#{jobParameters [batchId]}")) throws Exception{
		returns stepBUilderFactory.get("retrieveTodoActStep01").tasklet((contribution, chunckContext)=>{
			log.debug("======step in======");
			ActJobDTO actjobDto = new ActJobDto();
			List<ActTodoBatDto> actTodoBatDtoList ;
			
			actTodoBatDtoList = commonDao.selectList("B.retrieveActList.retrieveActList", batchId);
			
			int actCnt = actTodoBatDtoList != null ?actTodoBatDtoList.size():0;
			//활성 액션 건별처리 
			for(int i =0; i<actCnt; i++) {
				try {
					log.debug("retrieveTodoActstep01 :: ");
					actCommMgmtSErvice.saveActCommMgmt(actCnt, batchId, null, actTodoBatDtoList.get(i);)
				}catch(BixException e) {
					log.error("{}",e);
					
					if(actTodoBatDtoList != null) {
						actFailCheckService.failCheck(null, actTodoBatDtoList.get(i);)
					}
				}
			}
		}
		return RepeatStatus.FINISHED;
		).listener(neww BaseStepLogger())
		.listener(new BashChunkLogger())
		.build();
		
	NkLCBDT
	}
}
