package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementLifecycleAndMaintenance
 */

@JsonTypeName("PrefabElement_lifecycleAndMaintenance")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementLifecycleAndMaintenance {

  private String expectedLifespan;

  private String maintenanceRequirements;

  private String warranty;

  public PrefabElementLifecycleAndMaintenance expectedLifespan(String expectedLifespan) {
    this.expectedLifespan = expectedLifespan;
    return this;
  }

  /**
   * Get expectedLifespan
   * @return expectedLifespan
   */
  
  @Schema(name = "expectedLifespan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("expectedLifespan")
  public String getExpectedLifespan() {
    return expectedLifespan;
  }

  public void setExpectedLifespan(String expectedLifespan) {
    this.expectedLifespan = expectedLifespan;
  }

  public PrefabElementLifecycleAndMaintenance maintenanceRequirements(String maintenanceRequirements) {
    this.maintenanceRequirements = maintenanceRequirements;
    return this;
  }

  /**
   * Get maintenanceRequirements
   * @return maintenanceRequirements
   */
  
  @Schema(name = "maintenanceRequirements", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("maintenanceRequirements")
  public String getMaintenanceRequirements() {
    return maintenanceRequirements;
  }

  public void setMaintenanceRequirements(String maintenanceRequirements) {
    this.maintenanceRequirements = maintenanceRequirements;
  }

  public PrefabElementLifecycleAndMaintenance warranty(String warranty) {
    this.warranty = warranty;
    return this;
  }

  /**
   * Get warranty
   * @return warranty
   */
  
  @Schema(name = "warranty", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warranty")
  public String getWarranty() {
    return warranty;
  }

  public void setWarranty(String warranty) {
    this.warranty = warranty;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementLifecycleAndMaintenance prefabElementLifecycleAndMaintenance = (PrefabElementLifecycleAndMaintenance) o;
    return Objects.equals(this.expectedLifespan, prefabElementLifecycleAndMaintenance.expectedLifespan) &&
        Objects.equals(this.maintenanceRequirements, prefabElementLifecycleAndMaintenance.maintenanceRequirements) &&
        Objects.equals(this.warranty, prefabElementLifecycleAndMaintenance.warranty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expectedLifespan, maintenanceRequirements, warranty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementLifecycleAndMaintenance {\n");
    sb.append("    expectedLifespan: ").append(toIndentedString(expectedLifespan)).append("\n");
    sb.append("    maintenanceRequirements: ").append(toIndentedString(maintenanceRequirements)).append("\n");
    sb.append("    warranty: ").append(toIndentedString(warranty)).append("\n");
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

