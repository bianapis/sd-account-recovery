package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * WritedownWithIdAndRoot
 */
public class WritedownWithIdAndRoot   {
  private String accountRecoveryCaseWritedownTaskReference = null;

  private String accountRecoveryCaseReference = null;

  private Object accountRecoveryCaseRecord = null;

  private String accountWritedownTransaction = null;

  private Object accountRecoveryCaseWritedownTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return accountRecoveryCaseWritedownTaskReference
  **/

  public String getAccountRecoveryCaseWritedownTaskReference() {
    return accountRecoveryCaseWritedownTaskReference;
  }

  public void setAccountRecoveryCaseWritedownTaskReference(String accountRecoveryCaseWritedownTaskReference) {
    this.accountRecoveryCaseWritedownTaskReference = accountRecoveryCaseWritedownTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text         
   * @return accountWritedownTransaction
  **/

  public String getAccountWritedownTransaction() {
    return accountWritedownTransaction;
  }

  public void setAccountWritedownTransaction(String accountWritedownTransaction) {
    this.accountWritedownTransaction = accountWritedownTransaction;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary           
   * @return accountRecoveryCaseWritedownTaskRecord
  **/

  public Object getAccountRecoveryCaseWritedownTaskRecord() {
    return accountRecoveryCaseWritedownTaskRecord;
  }

  public void setAccountRecoveryCaseWritedownTaskRecord(Object accountRecoveryCaseWritedownTaskRecord) {
    this.accountRecoveryCaseWritedownTaskRecord = accountRecoveryCaseWritedownTaskRecord;
  }


}

