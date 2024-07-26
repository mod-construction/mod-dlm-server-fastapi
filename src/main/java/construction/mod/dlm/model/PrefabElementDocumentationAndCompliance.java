package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import construction.mod.dlm.model.PrefabElementDocumentationAndComplianceCertifications;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementDocumentationAndCompliance
 */

@JsonTypeName("PrefabElement_documentationAndCompliance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementDocumentationAndCompliance {

  private String technicalSpecifications;

  private PrefabElementDocumentationAndComplianceCertifications certifications;

  public PrefabElementDocumentationAndCompliance() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementDocumentationAndCompliance(String technicalSpecifications, PrefabElementDocumentationAndComplianceCertifications certifications) {
    this.technicalSpecifications = technicalSpecifications;
    this.certifications = certifications;
  }

  public PrefabElementDocumentationAndCompliance technicalSpecifications(String technicalSpecifications) {
    this.technicalSpecifications = technicalSpecifications;
    return this;
  }

  /**
   * Get technicalSpecifications
   * @return technicalSpecifications
   */
  @NotNull 
  @Schema(name = "technicalSpecifications", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("technicalSpecifications")
  public String getTechnicalSpecifications() {
    return technicalSpecifications;
  }

  public void setTechnicalSpecifications(String technicalSpecifications) {
    this.technicalSpecifications = technicalSpecifications;
  }

  public PrefabElementDocumentationAndCompliance certifications(PrefabElementDocumentationAndComplianceCertifications certifications) {
    this.certifications = certifications;
    return this;
  }

  /**
   * Get certifications
   * @return certifications
   */
  @NotNull @Valid 
  @Schema(name = "certifications", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("certifications")
  public PrefabElementDocumentationAndComplianceCertifications getCertifications() {
    return certifications;
  }

  public void setCertifications(PrefabElementDocumentationAndComplianceCertifications certifications) {
    this.certifications = certifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementDocumentationAndCompliance prefabElementDocumentationAndCompliance = (PrefabElementDocumentationAndCompliance) o;
    return Objects.equals(this.technicalSpecifications, prefabElementDocumentationAndCompliance.technicalSpecifications) &&
        Objects.equals(this.certifications, prefabElementDocumentationAndCompliance.certifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicalSpecifications, certifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementDocumentationAndCompliance {\n");
    sb.append("    technicalSpecifications: ").append(toIndentedString(technicalSpecifications)).append("\n");
    sb.append("    certifications: ").append(toIndentedString(certifications)).append("\n");
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

