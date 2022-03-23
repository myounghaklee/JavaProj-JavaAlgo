package tmp;

public class ActFailCheckService {
	private ActService actServicce
	
	@Transactional (propagation = Propagation.NESTED)
	public void failCheck(ActTodoBatDTO anyActDto) {
		//파라미터 체크 
		if(NullUtil.isNull(actDTO))throw new BizException();
		
		actDto.setEntrRqstWorkStusCd("04")//에러 
		
		if(actService.updateWorkSttsCd(anyActDto) != 1) {
			throw new BizException();
		}
		
	}
}
