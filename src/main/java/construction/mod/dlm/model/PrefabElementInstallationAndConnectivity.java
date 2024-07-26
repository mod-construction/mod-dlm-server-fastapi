package construction.mod.dlm.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * PrefabElementInstallationAndConnectivity
 */

@JsonTypeName("PrefabElement_installationAndConnectivity")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementInstallationAndConnectivity {

  /**
   * Gets or Sets connectionType
   */
  public enum ConnectionTypeEnum {
    BOLT_ON("Bolt-on"),
    
    WELDED("Welded"),
    
    CLIP_ON("Clip-on"),
    
    ADHESIVE("Adhesive"),
    
    MORTAR("Mortar");

    private String value;

    ConnectionTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConnectionTypeEnum fromValue(String value) {
      for (ConnectionTypeEnum b : ConnectionTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ConnectionTypeEnum connectionType;

  private String installationTime;

  /**
   * Gets or Sets compatibility
   */
  public enum CompatibilityEnum {
    STEEL_FRAME("Steel Frame"),
    
    WOOD_FRAME("Wood Frame"),
    
    CONCRETE_STRUCTURE("Concrete Structure"),
    
    BRICKWORK("Brickwork"),
    
    MODULAR_SYSTEMS("Modular Systems"),
    
    GLASS_FACADES("Glass Facades"),
    
    COMPOSITE_MATERIALS("Composite Materials");

    private String value;

    CompatibilityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CompatibilityEnum fromValue(String value) {
      for (CompatibilityEnum b : CompatibilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private CompatibilityEnum compatibility;

  public PrefabElementInstallationAndConnectivity connectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
    return this;
  }

  /**
   * Get connectionType
   * @return connectionType
   */
  
  @Schema(name = "connectionType", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("connectionType")
  public ConnectionTypeEnum getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(ConnectionTypeEnum connectionType) {
    this.connectionType = connectionType;
  }

  public PrefabElementInstallationAndConnectivity installationTime(String installationTime) {
    this.installationTime = installationTime;
    return this;
  }

  /**
   * Get installationTime
   * @return installationTime
   */
  
  @Schema(name = "installationTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("installationTime")
  public String getInstallationTime() {
    return installationTime;
  }

  public void setInstallationTime(String installationTime) {
    this.installationTime = installationTime;
  }

  public PrefabElementInstallationAndConnectivity compatibility(CompatibilityEnum compatibility) {
    this.compatibility = compatibility;
    return this;
  }

  /**
   * Get compatibility
   * @return compatibility
   */
  
  @Schema(name = "compatibility", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compatibility")
  public CompatibilityEnum getCompatibility() {
    return compatibility;
  }

  public void setCompatibility(CompatibilityEnum compatibility) {
    this.compatibility = compatibility;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementInstallationAndConnectivity prefabElementInstallationAndConnectivity = (PrefabElementInstallationAndConnectivity) o;
    return Objects.equals(this.connectionType, prefabElementInstallationAndConnectivity.connectionType) &&
        Objects.equals(this.installationTime, prefabElementInstallationAndConnectivity.installationTime) &&
        Objects.equals(this.compatibility, prefabElementInstallationAndConnectivity.compatibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connectionType, installationTime, compatibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementInstallationAndConnectivity {\n");
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
    sb.append("    installationTime: ").append(toIndentedString(installationTime)).append("\n");
    sb.append("    compatibility: ").append(toIndentedString(compatibility)).append("\n");
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

