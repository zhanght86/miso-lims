package uk.ac.bbsrc.tgac.miso.core.data;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import com.eaglegenomics.simlims.core.User;

import uk.ac.bbsrc.tgac.miso.core.data.impl.kit.KitDescriptor;

@JsonIgnoreProperties({ "sample" })
public interface SampleAdditionalInfo {

  Long getSampleId();

  void setSampleId(Long sampleAdditionalInfoId);

  Sample getSample();

  void setSample(Sample sample);

  SampleClass getSampleClass();

  void setSampleClass(SampleClass sampleClass);

  TissueOrigin getTissueOrigin();

  void setTissueOrigin(TissueOrigin tissueOrigin);

  TissueType getTissueType();

  void setTissueType(TissueType tissueType);

  Subproject getSubproject();

  void setSubproject(Subproject subproject);

  Integer getPassageNumber();

  void setPassageNumber(Integer passageNumber);

  Integer getTimesReceived();

  void setTimesReceived(Integer timesReceived);

  Integer getTubeNumber();

  void setTubeNumber(Integer tubeNumber);

  Double getConcentration();

  void setConcentration(Double concentration);

  Boolean getArchived();

  void setArchived(Boolean archived);

  User getCreatedBy();

  void setCreatedBy(User createdBy);

  Date getCreationDate();

  void setCreationDate(Date creationDate);

  User getUpdatedBy();

  void setUpdatedBy(User updatedBy);

  Date getLastUpdated();

  void setLastUpdated(Date lastUpdated);

  QcPassedDetail getQcPassedDetail();

  void setQcPassedDetail(QcPassedDetail qcPassedDetail);

  KitDescriptor getPrepKit();

  void setPrepKit(KitDescriptor prepKit);
  
  /**
   * @return the sample's identifying name or ID at the source Institute
   */
  String getExternalInstituteIdentifier();

  /**
   * Sets the sample's identifying name or ID at the source Institute
   * 
   * @param externalInstituteIdentifier
   */
  void setExternalInstituteIdentifier(String externalInstituteIdentifier);

  Lab getLab();

  void setLab(Lab lab);

  /**
   * This method should ONLY be used for load/save coordination between the Hibernate and old SQL DAOs. For all other purposes, use
   * getPrepKit().getKitDescriptorId()
   * 
   * @return the Kit Descriptor ID loaded by/for Hibernate
   */
  Long getHibernateKitDescriptorId();

}