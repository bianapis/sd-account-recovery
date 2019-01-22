package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * NegotiationWithIdAndRoot
 */
public class NegotiationWithIdAndRoot   {
  private String accountRecoveryCaseNegotiationTaskReference = null;

  private String accountRecoveryCaseReference = null;

  private String accountRecoveryGuidelines = null;

  private String correspondenceReference = null;

  private String correspondenceContent = null;

  private String documentReference = null;

  private String documentContent = null;

  private Object accountRecoveryCaseNegotiationTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier   
   * @return accountRecoveryCaseNegotiationTaskReference
  **/

  public String getAccountRecoveryCaseNegotiationTaskReference() {
    return accountRecoveryCaseNegotiationTaskReference;
  }

  public void setAccountRecoveryCaseNegotiationTaskReference(String accountRecoveryCaseNegotiationTaskReference) {
    this.accountRecoveryCaseNegotiationTaskReference = accountRecoveryCaseNegotiationTaskReference;
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
   * @return accountRecoveryGuidelines
  **/

  public String getAccountRecoveryGuidelines() {
    return accountRecoveryGuidelines;
  }

  public void setAccountRecoveryGuidelines(String accountRecoveryGuidelines) {
    this.accountRecoveryGuidelines = accountRecoveryGuidelines;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return correspondenceReference
  **/

  public String getCorrespondenceReference() {
    return correspondenceReference;
  }

  public void setCorrespondenceReference(String correspondenceReference) {
    this.correspondenceReference = correspondenceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text     
   * @return correspondenceContent
  **/

  public String getCorrespondenceContent() {
    return correspondenceContent;
  }

  public void setCorrespondenceContent(String correspondenceContent) {
    this.correspondenceContent = correspondenceContent;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  
   * @return documentReference
  **/

  public String getDocumentReference() {
    return documentReference;
  }

  public void setDocumentReference(String documentReference) {
    this.documentReference = documentReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text         
   * @return documentContent
  **/

  public String getDocumentContent() {
    return documentContent;
  }

  public void setDocumentContent(String documentContent) {
    this.documentContent = documentContent;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary                   
   * @return accountRecoveryCaseNegotiationTaskRecord
  **/

  public Object getAccountRecoveryCaseNegotiationTaskRecord() {
    return accountRecoveryCaseNegotiationTaskRecord;
  }

  public void setAccountRecoveryCaseNegotiationTaskRecord(Object accountRecoveryCaseNegotiationTaskRecord) {
    this.accountRecoveryCaseNegotiationTaskRecord = accountRecoveryCaseNegotiationTaskRecord;
  }


}

