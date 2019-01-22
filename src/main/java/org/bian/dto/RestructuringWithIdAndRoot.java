package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * RestructuringWithIdAndRoot
 */
public class RestructuringWithIdAndRoot   {
  private String accountRecoveryCaseRestructuringTaskReference = null;

  private String accountRecoveryCaseReference = null;

  private String accountRecoveryRestructuringSchedule = null;

  private String linkedProductInstanceReference = null;

  private Object accountRecoveryCaseRestructuringTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return accountRecoveryCaseRestructuringTaskReference
  **/

  public String getAccountRecoveryCaseRestructuringTaskReference() {
    return accountRecoveryCaseRestructuringTaskReference;
  }

  public void setAccountRecoveryCaseRestructuringTaskReference(String accountRecoveryCaseRestructuringTaskReference) {
    this.accountRecoveryCaseRestructuringTaskReference = accountRecoveryCaseRestructuringTaskReference;
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
   * @return accountRecoveryRestructuringSchedule
  **/

  public String getAccountRecoveryRestructuringSchedule() {
    return accountRecoveryRestructuringSchedule;
  }

  public void setAccountRecoveryRestructuringSchedule(String accountRecoveryRestructuringSchedule) {
    this.accountRecoveryRestructuringSchedule = accountRecoveryRestructuringSchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier        
   * @return linkedProductInstanceReference
  **/

  public String getLinkedProductInstanceReference() {
    return linkedProductInstanceReference;
  }

  public void setLinkedProductInstanceReference(String linkedProductInstanceReference) {
    this.linkedProductInstanceReference = linkedProductInstanceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary   
   * @return accountRecoveryCaseRestructuringTaskRecord
  **/

  public Object getAccountRecoveryCaseRestructuringTaskRecord() {
    return accountRecoveryCaseRestructuringTaskRecord;
  }

  public void setAccountRecoveryCaseRestructuringTaskRecord(Object accountRecoveryCaseRestructuringTaskRecord) {
    this.accountRecoveryCaseRestructuringTaskRecord = accountRecoveryCaseRestructuringTaskRecord;
  }


}

