/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Process;

@BianRestController
public class AccountRecoveryApiController {

	@Autowired
	AccountRecoveryApiService service;
	
	@Process.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@Process.ExecutePut
	public BianResponse<AccountRecoveryWithId> executePut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AccountRecovery> bianRequest) {
		return BianResponse.forSuccess(service.executePut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.ExecutePost
	public BianResponse<AccountRecoveryWithId> executePost(@RequestBody BianRequest<AccountRecovery> bianRequest) {
		return BianResponse.forSuccess(service.executePost(bianRequest.getData()));
	}
	
	@Process.Record
	public BianResponse<RecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<RecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPut
	public BianResponse<AccountRecoveryWithId> requestPut(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AccountRecovery> bianRequest) {
		return BianResponse.forSuccess(service.requestPut(crReferenceId, bianRequest.getData()));
	}
	
	@Process.RequestPost
	public BianResponse<AccountRecoveryWithId> requestPost(@RequestBody BianRequest<AccountRecovery> bianRequest) {
		return BianResponse.forSuccess(service.requestPost(bianRequest.getData()));
	}
	
	@Process.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Process.Retrieve
	public BianResponse<AccountRecoveryWithId> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@BQ("assessments")
	@Process.Retrieve
	public BianResponse<AssessmentWithIdAndRoot> retrieveAssessments(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveAssessments(crReferenceId, bqReferenceId));
	}
	
	@Process.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@BQ("negotiations")
	@Process.Retrieve
	public BianResponse<NegotiationWithIdAndRoot> retrieveNegotiations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveNegotiations(crReferenceId, bqReferenceId));
	}
	
	@BQ("plannings")
	@Process.Retrieve
	public BianResponse<PlanningWithIdAndRoot> retrievePlannings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrievePlannings(crReferenceId, bqReferenceId));
	}
	
	@BQ("reportings")
	@Process.Retrieve
	public BianResponse<ReportingWithIdAndRoot> retrieveReportings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReportings(crReferenceId, bqReferenceId));
	}
	
	@BQ("restructurings")
	@Process.Retrieve
	public BianResponse<RestructuringWithIdAndRoot> retrieveRestructurings(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRestructurings(crReferenceId, bqReferenceId));
	}
	
	@BQ("writedowns")
	@Process.Retrieve
	public BianResponse<WritedownWithIdAndRoot> retrieveWritedowns(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWritedowns(crReferenceId, bqReferenceId));
	}
	
	@Process.Update
	public BianResponse<AccountRecoveryWithId> update(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<AccountRecovery> bianRequest) {
		return BianResponse.forSuccess(service.update(crReferenceId, bianRequest.getData()));
	}
	
}
