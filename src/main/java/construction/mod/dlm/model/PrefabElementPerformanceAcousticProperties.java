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
 * PrefabElementPerformanceAcousticProperties
 */

@JsonTypeName("PrefabElement_performance_acousticProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-26T13:42:12.093278860Z[Etc/UTC]", comments = "Generator version: 7.8.0-SNAPSHOT")
public class PrefabElementPerformanceAcousticProperties {

  private String soundInsulationRating;

  private String acousticPerformance;

  public PrefabElementPerformanceAcousticProperties() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public PrefabElementPerformanceAcousticProperties(String soundInsulationRating, String acousticPerformance) {
    this.soundInsulationRating = soundInsulationRating;
    this.acousticPerformance = acousticPerformance;
  }

  public PrefabElementPerformanceAcousticProperties soundInsulationRating(String soundInsulationRating) {
    this.soundInsulationRating = soundInsulationRating;
    return this;
  }

  /**
   * Get soundInsulationRating
   * @return soundInsulationRating
   */
  @NotNull 
  @Schema(name = "soundInsulationRating", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("soundInsulationRating")
  public String getSoundInsulationRating() {
    return soundInsulationRating;
  }

  public void setSoundInsulationRating(String soundInsulationRating) {
    this.soundInsulationRating = soundInsulationRating;
  }

  public PrefabElementPerformanceAcousticProperties acousticPerformance(String acousticPerformance) {
    this.acousticPerformance = acousticPerformance;
    return this;
  }

  /**
   * Get acousticPerformance
   * @return acousticPerformance
   */
  @NotNull 
  @Schema(name = "acousticPerformance", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("acousticPerformance")
  public String getAcousticPerformance() {
    return acousticPerformance;
  }

  public void setAcousticPerformance(String acousticPerformance) {
    this.acousticPerformance = acousticPerformance;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrefabElementPerformanceAcousticProperties prefabElementPerformanceAcousticProperties = (PrefabElementPerformanceAcousticProperties) o;
    return Objects.equals(this.soundInsulationRating, prefabElementPerformanceAcousticProperties.soundInsulationRating) &&
        Objects.equals(this.acousticPerformance, prefabElementPerformanceAcousticProperties.acousticPerformance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(soundInsulationRating, acousticPerformance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefabElementPerformanceAcousticProperties {\n");
    sb.append("    soundInsulationRating: ").append(toIndentedString(soundInsulationRating)).append("\n");
    sb.append("    acousticPerformance: ").append(toIndentedString(acousticPerformance)).append("\n");
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

