package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementDocumentationAndComplianceCertifications
 */

@JsonTypeName("PrefabElement_documentationAndCompliance_certifications")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementDocumentationAndComplianceCertifications {

  @Valid
  private List<String> certificationTypes = new ArrayList<>();

  @Valid
  private List<String> regulatoryApprovals = new ArrayList<>();

  public PrefabElementDocumentationAndComplianceCertifications() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementDocumentationAndComplianceCertifications(List<String> certificationTypes, List<String> regulatoryApprovals) {
    this.certificationTypes = certificationTypes;
    this.regulatoryApprovals = regulatoryApprovals;
  }

  public PrefabElementDocumentationAndComplianceCertifications certificationTypes(List<String> certificationTypes) {
    this.certificationTypes = certificationTypes;
    return this;
  }

  public PrefabElementDocumentationAndComplianceCertifications addCertificationTypesItem(String certificationTypesItem) {
    if (this.certificationTypes == null) {
      this.certificationTypes = new ArrayList<>();
    }
    this.certificationTypes.add(certificationTypesItem);
    return this;
  }

  /**
   * Get certificationTypes
   * @return certificationTypes
   */
  @NotNull 
  @Schema(name = "certificationTypes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("certificationTypes")
  public List<String> getCertificationTypes() {
    return certificationTypes;
  }

  public void setCertificationTypes(List<String> certificationTypes) {
    this.certificationTypes = certificationTypes;
  }

  public PrefabElementDocumentationAndComplianceCertifications regulatoryApprovals(List<String> regulatoryApprovals) {
    this.regulatoryApprovals = regulatoryApprovals;
    return this;
  }

  public PrefabElementDocumentationAndComplianceCertifications addRegulatoryApprovalsItem(String regulatoryApprovalsItem) {
    if (this.regulatoryApprovals == null) {
      this.regulatoryApprovals = new ArrayList<>();
    }
    this.regulatoryApprovals.add(regulatoryApprovalsItem);
    return this;
  }

  /**
   * Get regulatoryApprovals
   * @return regulatoryApprovals
   */
  @NotNull 
  @Schema(name = "regulatoryApprovals", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regulatoryApprovals")
  public List<String> getRegulatoryApprovals() {
    return regulatoryApprovals;
  }

  public void setRegulatoryApprovals(List<String> regulatoryApprovals) {
    this.regulatoryApprovals = regulatoryApprovals;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementDocumentationAndComplianceCertifications prefabElementDocumentationAndComplianceCertifications = (PrefabElementDocumentationAndComplianceCertifications) o;
    return Objects.equals(this.certificationTypes, prefabElementDocumentationAndComplianceCertifications.certificationTypes) &&
        Objects.equals(this.regulatoryApprovals, prefabElementDocumentationAndComplianceCertifications.regulatoryApprovals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(certificationTypes, regulatoryApprovals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementDocumentationAndComplianceCertifications {\n");
    sb.append("    certificationTypes: ").append(toIndentedString(certificationTypes)).append("\n");
    sb.append("    regulatoryApprovals: ").append(toIndentedString(regulatoryApprovals)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

