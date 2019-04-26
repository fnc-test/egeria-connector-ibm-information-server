/* SPDX-License-Identifier: Apache-2.0 */
/* Copyright Contributors to the ODPi Egeria project. */
package org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.generated.v11710;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.annotation.Generated;
import org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.common.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

/**
 * POJO for the {@code infoset} asset type in IGC, displayed as '{@literal InfoSet}' in the IGC UI.
 * <br><br>
 * (this code has been generated based on out-of-the-box IGC metadata types;
 *  if modifications are needed, eg. to handle custom attributes,
 *  extending from this class in your own custom class is the best approach.)
 */
@Generated("org.odpi.egeria.connectors.ibm.igc.clientlibrary.model.IGCRestModelGenerator")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeName("infoset")
public class Infoset extends Reference {

    public static String getIgcTypeDisplayName() { return "InfoSet"; }

    /**
     * The {@code name} property, displayed as '{@literal Name}' in the IGC UI.
     */
    protected String name;

    /**
     * The {@code instance} property, displayed as '{@literal Instance}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link Instance} object.
     */
    protected Reference instance;

    /**
     * The {@code short_description} property, displayed as '{@literal Short Description}' in the IGC UI.
     */
    protected String short_description;

    /**
     * The {@code long_description} property, displayed as '{@literal Long Description}' in the IGC UI.
     */
    protected String long_description;

    /**
     * The {@code labels} property, displayed as '{@literal Labels}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Label} objects.
     */
    protected ReferenceList labels;

    /**
     * The {@code stewards} property, displayed as '{@literal Stewards}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link AsclSteward} objects.
     */
    protected ReferenceList stewards;

    /**
     * The {@code assigned_to_terms} property, displayed as '{@literal Assigned to Terms}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Term} objects.
     */
    protected ReferenceList assigned_to_terms;

    /**
     * The {@code implements_rules} property, displayed as '{@literal Implements Rules}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationGovernanceRule} objects.
     */
    protected ReferenceList implements_rules;

    /**
     * The {@code governed_by_rules} property, displayed as '{@literal Governed by Rules}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InformationGovernanceRule} objects.
     */
    protected ReferenceList governed_by_rules;

    /**
     * The {@code sync_type} property, displayed as '{@literal Include For Governance}' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>Regular (displayed in the UI as 'Regular')</li>
     *     <li>InferredPartial (displayed in the UI as 'Inferred Partial')</li>
     *     <li>InferredFull (displayed in the UI as 'Inferred Full')</li>
     * </ul>
     */
    protected String sync_type;

    /**
     * The {@code type} property, displayed as '{@literal Type}' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>User (displayed in the UI as 'User')</li>
     *     <li>System (displayed in the UI as 'System')</li>
     * </ul>
     */
    protected String type;

    /**
     * The {@code composition} property, displayed as '{@literal Composition}' in the IGC UI.
     * <br><br>
     * Can be one of the following values:
     * <ul>
     *     <li>MixedLevel (displayed in the UI as 'MixedLevel')</li>
     *     <li>TopLevel (displayed in the UI as 'TopLevel')</li>
     * </ul>
     */
    protected String composition;

    /**
     * The {@code object_count} property, displayed as '{@literal Number of Objects}' in the IGC UI.
     */
    protected Number object_count;

    /**
     * The {@code size} property, displayed as '{@literal Size (Bytes)}' in the IGC UI.
     */
    protected Number size;

    /**
     * The {@code creator} property, displayed as '{@literal Creator}' in the IGC UI.
     */
    protected String creator;

    /**
     * The {@code created} property, displayed as '{@literal Created}' in the IGC UI.
     */
    protected Date created;

    /**
     * The {@code applied_data_classes} property, displayed as '{@literal Data Classifications}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link ClassificationContribution} objects.
     */
    protected ReferenceList applied_data_classes;

    /**
     * The {@code tool_id} property, displayed as '{@literal Tool ID}' in the IGC UI.
     */
    protected String tool_id;

    /**
     * The {@code sync_state} property, displayed as '{@literal State}' in the IGC UI.
     */
    protected String sync_state;

    /**
     * The {@code url} property, displayed as '{@literal URL}' in the IGC UI.
     */
    protected String url;

    /**
     * The {@code contributing_volumes} property, displayed as '{@literal Volumes}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link VolumeContribution} objects.
     */
    protected ReferenceList contributing_volumes;

    /**
     * The {@code created_with} property, displayed as '{@literal Originating Operation}' in the IGC UI.
     * <br><br>
     * Will be a single {@link Reference} to a {@link InfosetOperation} object.
     */
    protected Reference created_with;

    /**
     * The {@code contributing_operations} property, displayed as '{@literal Applied Operations}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link InfosetOperation} objects.
     */
    protected ReferenceList contributing_operations;

    /**
     * The {@code alias_(business_name)} property, displayed as '{@literal Alias (Business Name)}' in the IGC UI.
     */
    @JsonProperty("alias_(business_name)") protected String alias__business_name_;

    /**
     * The {@code native_id} property, displayed as '{@literal Native ID}' in the IGC UI.
     */
    protected String native_id;

    /**
     * The {@code in_collections} property, displayed as '{@literal In Collections}' in the IGC UI.
     * <br><br>
     * Will be a {@link ReferenceList} of {@link Collection} objects.
     */
    protected ReferenceList in_collections;

    /**
     * The {@code created_by} property, displayed as '{@literal Created By}' in the IGC UI.
     */
    protected String created_by;

    /**
     * The {@code created_on} property, displayed as '{@literal Created On}' in the IGC UI.
     */
    protected Date created_on;

    /**
     * The {@code modified_by} property, displayed as '{@literal Modified By}' in the IGC UI.
     */
    protected String modified_by;

    /**
     * The {@code modified_on} property, displayed as '{@literal Modified On}' in the IGC UI.
     */
    protected Date modified_on;


    /** @see #name */ @JsonProperty("name")  public String getTheName() { return this.name; }
    /** @see #name */ @JsonProperty("name")  public void setTheName(String name) { this.name = name; }

    /** @see #instance */ @JsonProperty("instance")  public Reference getInstance() { return this.instance; }
    /** @see #instance */ @JsonProperty("instance")  public void setInstance(Reference instance) { this.instance = instance; }

    /** @see #short_description */ @JsonProperty("short_description")  public String getShortDescription() { return this.short_description; }
    /** @see #short_description */ @JsonProperty("short_description")  public void setShortDescription(String short_description) { this.short_description = short_description; }

    /** @see #long_description */ @JsonProperty("long_description")  public String getLongDescription() { return this.long_description; }
    /** @see #long_description */ @JsonProperty("long_description")  public void setLongDescription(String long_description) { this.long_description = long_description; }

    /** @see #labels */ @JsonProperty("labels")  public ReferenceList getLabels() { return this.labels; }
    /** @see #labels */ @JsonProperty("labels")  public void setLabels(ReferenceList labels) { this.labels = labels; }

    /** @see #stewards */ @JsonProperty("stewards")  public ReferenceList getStewards() { return this.stewards; }
    /** @see #stewards */ @JsonProperty("stewards")  public void setStewards(ReferenceList stewards) { this.stewards = stewards; }

    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public ReferenceList getAssignedToTerms() { return this.assigned_to_terms; }
    /** @see #assigned_to_terms */ @JsonProperty("assigned_to_terms")  public void setAssignedToTerms(ReferenceList assigned_to_terms) { this.assigned_to_terms = assigned_to_terms; }

    /** @see #implements_rules */ @JsonProperty("implements_rules")  public ReferenceList getImplementsRules() { return this.implements_rules; }
    /** @see #implements_rules */ @JsonProperty("implements_rules")  public void setImplementsRules(ReferenceList implements_rules) { this.implements_rules = implements_rules; }

    /** @see #governed_by_rules */ @JsonProperty("governed_by_rules")  public ReferenceList getGovernedByRules() { return this.governed_by_rules; }
    /** @see #governed_by_rules */ @JsonProperty("governed_by_rules")  public void setGovernedByRules(ReferenceList governed_by_rules) { this.governed_by_rules = governed_by_rules; }

    /** @see #sync_type */ @JsonProperty("sync_type")  public String getSyncType() { return this.sync_type; }
    /** @see #sync_type */ @JsonProperty("sync_type")  public void setSyncType(String sync_type) { this.sync_type = sync_type; }

    /** @see #type */ @JsonProperty("type")  public String getTheType() { return this.type; }
    /** @see #type */ @JsonProperty("type")  public void setTheType(String type) { this.type = type; }

    /** @see #composition */ @JsonProperty("composition")  public String getComposition() { return this.composition; }
    /** @see #composition */ @JsonProperty("composition")  public void setComposition(String composition) { this.composition = composition; }

    /** @see #object_count */ @JsonProperty("object_count")  public Number getObjectCount() { return this.object_count; }
    /** @see #object_count */ @JsonProperty("object_count")  public void setObjectCount(Number object_count) { this.object_count = object_count; }

    /** @see #size */ @JsonProperty("size")  public Number getSize() { return this.size; }
    /** @see #size */ @JsonProperty("size")  public void setSize(Number size) { this.size = size; }

    /** @see #creator */ @JsonProperty("creator")  public String getCreator() { return this.creator; }
    /** @see #creator */ @JsonProperty("creator")  public void setCreator(String creator) { this.creator = creator; }

    /** @see #created */ @JsonProperty("created")  public Date getCreated() { return this.created; }
    /** @see #created */ @JsonProperty("created")  public void setCreated(Date created) { this.created = created; }

    /** @see #applied_data_classes */ @JsonProperty("applied_data_classes")  public ReferenceList getAppliedDataClasses() { return this.applied_data_classes; }
    /** @see #applied_data_classes */ @JsonProperty("applied_data_classes")  public void setAppliedDataClasses(ReferenceList applied_data_classes) { this.applied_data_classes = applied_data_classes; }

    /** @see #tool_id */ @JsonProperty("tool_id")  public String getToolId() { return this.tool_id; }
    /** @see #tool_id */ @JsonProperty("tool_id")  public void setToolId(String tool_id) { this.tool_id = tool_id; }

    /** @see #sync_state */ @JsonProperty("sync_state")  public String getSyncState() { return this.sync_state; }
    /** @see #sync_state */ @JsonProperty("sync_state")  public void setSyncState(String sync_state) { this.sync_state = sync_state; }

    /** @see #url */ @JsonProperty("url")  public String getTheUrl() { return this.url; }
    /** @see #url */ @JsonProperty("url")  public void setTheUrl(String url) { this.url = url; }

    /** @see #contributing_volumes */ @JsonProperty("contributing_volumes")  public ReferenceList getContributingVolumes() { return this.contributing_volumes; }
    /** @see #contributing_volumes */ @JsonProperty("contributing_volumes")  public void setContributingVolumes(ReferenceList contributing_volumes) { this.contributing_volumes = contributing_volumes; }

    /** @see #created_with */ @JsonProperty("created_with")  public Reference getCreatedWith() { return this.created_with; }
    /** @see #created_with */ @JsonProperty("created_with")  public void setCreatedWith(Reference created_with) { this.created_with = created_with; }

    /** @see #contributing_operations */ @JsonProperty("contributing_operations")  public ReferenceList getContributingOperations() { return this.contributing_operations; }
    /** @see #contributing_operations */ @JsonProperty("contributing_operations")  public void setContributingOperations(ReferenceList contributing_operations) { this.contributing_operations = contributing_operations; }

    /** @see #alias__business_name_ */ @JsonProperty("alias_(business_name)")  public String getAliasBusinessName() { return this.alias__business_name_; }
    /** @see #alias__business_name_ */ @JsonProperty("alias_(business_name)")  public void setAliasBusinessName(String alias__business_name_) { this.alias__business_name_ = alias__business_name_; }

    /** @see #native_id */ @JsonProperty("native_id")  public String getNativeId() { return this.native_id; }
    /** @see #native_id */ @JsonProperty("native_id")  public void setNativeId(String native_id) { this.native_id = native_id; }

    /** @see #in_collections */ @JsonProperty("in_collections")  public ReferenceList getInCollections() { return this.in_collections; }
    /** @see #in_collections */ @JsonProperty("in_collections")  public void setInCollections(ReferenceList in_collections) { this.in_collections = in_collections; }

    /** @see #created_by */ @JsonProperty("created_by")  public String getCreatedBy() { return this.created_by; }
    /** @see #created_by */ @JsonProperty("created_by")  public void setCreatedBy(String created_by) { this.created_by = created_by; }

    /** @see #created_on */ @JsonProperty("created_on")  public Date getCreatedOn() { return this.created_on; }
    /** @see #created_on */ @JsonProperty("created_on")  public void setCreatedOn(Date created_on) { this.created_on = created_on; }

    /** @see #modified_by */ @JsonProperty("modified_by")  public String getModifiedBy() { return this.modified_by; }
    /** @see #modified_by */ @JsonProperty("modified_by")  public void setModifiedBy(String modified_by) { this.modified_by = modified_by; }

    /** @see #modified_on */ @JsonProperty("modified_on")  public Date getModifiedOn() { return this.modified_on; }
    /** @see #modified_on */ @JsonProperty("modified_on")  public void setModifiedOn(Date modified_on) { this.modified_on = modified_on; }

    public static Boolean canBeCreated() { return false; }
    public static Boolean includesModificationDetails() { return true; }
    private static final List<String> NON_RELATIONAL_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description",
        "sync_type",
        "type",
        "composition",
        "object_count",
        "size",
        "creator",
        "created",
        "tool_id",
        "sync_state",
        "url",
        "alias_(business_name)",
        "native_id",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    private static final List<String> STRING_PROPERTIES = Arrays.asList(
        "name",
        "short_description",
        "long_description",
        "creator",
        "tool_id",
        "sync_state",
        "url",
        "alias_(business_name)",
        "native_id",
        "created_by",
        "modified_by"
    );
    private static final List<String> PAGED_RELATIONAL_PROPERTIES = Arrays.asList(
        "labels",
        "stewards",
        "assigned_to_terms",
        "implements_rules",
        "governed_by_rules",
        "applied_data_classes",
        "contributing_volumes",
        "contributing_operations",
        "in_collections"
    );
    private static final List<String> ALL_PROPERTIES = Arrays.asList(
        "name",
        "instance",
        "short_description",
        "long_description",
        "labels",
        "stewards",
        "assigned_to_terms",
        "implements_rules",
        "governed_by_rules",
        "sync_type",
        "type",
        "composition",
        "object_count",
        "size",
        "creator",
        "created",
        "applied_data_classes",
        "tool_id",
        "sync_state",
        "url",
        "contributing_volumes",
        "created_with",
        "contributing_operations",
        "alias_(business_name)",
        "native_id",
        "in_collections",
        "created_by",
        "created_on",
        "modified_by",
        "modified_on"
    );
    public static List<String> getNonRelationshipProperties() { return NON_RELATIONAL_PROPERTIES; }
    public static List<String> getStringProperties() { return STRING_PROPERTIES; }
    public static List<String> getPagedRelationshipProperties() { return PAGED_RELATIONAL_PROPERTIES; }
    public static List<String> getAllProperties() { return ALL_PROPERTIES; }
    public static Boolean isInfoset(Object obj) { return (obj.getClass() == Infoset.class); }

}
