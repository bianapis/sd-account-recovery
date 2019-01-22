/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AccountRecoveryApiServiceImpl implements AccountRecoveryApiService {

	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public AccountRecoveryWithId executePut(String crReferenceId, AccountRecovery request){
		return JsonReader.read("executePut-AccountRecoveryWithId.json",new TypeReference<AccountRecoveryWithId>(){});
	}
	
	public AccountRecoveryWithId executePost(AccountRecovery request){
		return JsonReader.read("executePost-AccountRecoveryWithId.json",new TypeReference<AccountRecoveryWithId>(){});
	}
	
	public RecordResponse record(String crReferenceId, RecordRequest request){
		return JsonReader.read("record-RecordResponse.json",new TypeReference<RecordResponse>(){});
	}
	
	public AccountRecoveryWithId requestPut(String crReferenceId, AccountRecovery request){
		return JsonReader.read("requestPut-AccountRecoveryWithId.json",new TypeReference<AccountRecoveryWithId>(){});
	}
	
	public AccountRecoveryWithId requestPost(AccountRecovery request){
		return JsonReader.read("requestPost-AccountRecoveryWithId.json",new TypeReference<AccountRecoveryWithId>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public AccountRecoveryWithId retrieve(String crReferenceId){
		return JsonReader.read("retrieve-AccountRecoveryWithId.json",new TypeReference<AccountRecoveryWithId>(){});
	}
	
	public AssessmentWithIdAndRoot retrieveAssessments(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-AssessmentWithIdAndRoot.json",new TypeReference<AssessmentWithIdAndRoot>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public NegotiationWithIdAndRoot retrieveNegotiations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-NegotiationWithIdAndRoot.json",new TypeReference<NegotiationWithIdAndRoot>(){});
	}
	
	public PlanningWithIdAndRoot retrievePlannings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-PlanningWithIdAndRoot.json",new TypeReference<PlanningWithIdAndRoot>(){});
	}
	
	public ReportingWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-ReportingWithIdAndRoot.json",new TypeReference<ReportingWithIdAndRoot>(){});
	}
	
	public RestructuringWithIdAndRoot retrieveRestructurings(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-RestructuringWithIdAndRoot.json",new TypeReference<RestructuringWithIdAndRoot>(){});
	}
	
	public WritedownWithIdAndRoot retrieveWritedowns(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-WritedownWithIdAndRoot.json",new TypeReference<WritedownWithIdAndRoot>(){});
	}
	
	public AccountRecoveryWithId update(String crReferenceId, AccountRecovery request){
		return JsonReader.read("update-AccountRecoveryWithId.json",new TypeReference<AccountRecoveryWithId>(){});
	}
	
}
