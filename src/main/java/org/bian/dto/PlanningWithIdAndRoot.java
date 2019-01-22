package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * PlanningWithIdAndRoot
 */
public class PlanningWithIdAndRoot   {
  private String accountRecoveryCasePlanningTaskReference = null;

  private String accountRecoveryCaseReference = null;

  private String accountRecoveryPlan = null;

  private Object accountRecoveryCasePlanningTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return accountRecoveryCasePlanningTaskReference
  **/

  public String getAccountRecoveryCasePlanningTaskReference() {
    return accountRecoveryCasePlanningTaskReference;
  }

  public void setAccountRecoveryCasePlanningTaskReference(String accountRecoveryCasePlanningTaskReference) {
    this.accountRecoveryCasePlanningTaskReference = accountRecoveryCasePlanningTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text   
   * @return accountRecoveryPlan
  **/

  public String getAccountRecoveryPlan() {
    return accountRecoveryPlan;
  }

  public void setAccountRecoveryPlan(String accountRecoveryPlan) {
    this.accountRecoveryPlan = accountRecoveryPlan;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary         
   * @return accountRecoveryCasePlanningTaskRecord
  **/

  public Object getAccountRecoveryCasePlanningTaskRecord() {
    return accountRecoveryCasePlanningTaskRecord;
  }

  public void setAccountRecoveryCasePlanningTaskRecord(Object accountRecoveryCasePlanningTaskRecord) {
    this.accountRecoveryCasePlanningTaskRecord = accountRecoveryCasePlanningTaskRecord;
  }


}

