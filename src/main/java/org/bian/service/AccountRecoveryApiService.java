/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AccountRecoveryApiService {

	List<String> retrieveRefIds();
	
	AccountRecoveryWithId executePut(String crReferenceId, AccountRecovery request);
	
	AccountRecoveryWithId executePost(AccountRecovery request);
	
	RecordResponse record(String crReferenceId, RecordRequest request);
	
	AccountRecoveryWithId requestPut(String crReferenceId, AccountRecovery request);
	
	AccountRecoveryWithId requestPost(AccountRecovery request);
	
	List<String> retrieveBQs();
	
	AccountRecoveryWithId retrieve(String crReferenceId);
	
	AssessmentWithIdAndRoot retrieveAssessments(String crReferenceId, String bqReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	NegotiationWithIdAndRoot retrieveNegotiations(String crReferenceId, String bqReferenceId);
	
	PlanningWithIdAndRoot retrievePlannings(String crReferenceId, String bqReferenceId);
	
	ReportingWithIdAndRoot retrieveReportings(String crReferenceId, String bqReferenceId);
	
	RestructuringWithIdAndRoot retrieveRestructurings(String crReferenceId, String bqReferenceId);
	
	WritedownWithIdAndRoot retrieveWritedowns(String crReferenceId, String bqReferenceId);
	
	AccountRecoveryWithId update(String crReferenceId, AccountRecovery request);
	
}
