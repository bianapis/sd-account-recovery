package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * AssessmentWithIdAndRoot
 */
public class AssessmentWithIdAndRoot   {
  private String accountRecoveryCaseAssessmentTaskReference = null;

  private String accountRecoveryCaseReference = null;

  private Object accountRecoveryCaseRecord = null;

  private Object accountRecoveryCaseAssessmentTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return accountRecoveryCaseAssessmentTaskReference
  **/

  public String getAccountRecoveryCaseAssessmentTaskReference() {
    return accountRecoveryCaseAssessmentTaskReference;
  }

  public void setAccountRecoveryCaseAssessmentTaskReference(String accountRecoveryCaseAssessmentTaskReference) {
    this.accountRecoveryCaseAssessmentTaskReference = accountRecoveryCaseAssessmentTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier    
   * @return accountRecoveryCaseReference
  **/

  public String getAccountRecoveryCaseReference() {
    return accountRecoveryCaseReference;
  }

  public void setAccountRecoveryCaseReference(String accountRecoveryCaseReference) {
    this.accountRecoveryCaseReference = accountRecoveryCaseReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary     
   * @return accountRecoveryCaseRecord
  **/

  public Object getAccountRecoveryCaseRecord() {
    return accountRecoveryCaseRecord;
  }

  public void setAccountRecoveryCaseRecord(Object accountRecoveryCaseRecord) {
    this.accountRecoveryCaseRecord = accountRecoveryCaseRecord;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary             
   * @return accountRecoveryCaseAssessmentTaskRecord
  **/

  public Object getAccountRecoveryCaseAssessmentTaskRecord() {
    return accountRecoveryCaseAssessmentTaskRecord;
  }

  public void setAccountRecoveryCaseAssessmentTaskRecord(Object accountRecoveryCaseAssessmentTaskRecord) {
    this.accountRecoveryCaseAssessmentTaskRecord = accountRecoveryCaseAssessmentTaskRecord;
  }


}

