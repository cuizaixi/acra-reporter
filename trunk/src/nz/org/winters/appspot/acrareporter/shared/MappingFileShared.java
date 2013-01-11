package nz.org.winters.appspot.acrareporter.shared;

import java.io.Serializable;
import java.util.Date;

import com.google.gwt.user.client.rpc.IsSerializable;

/*
 * Copyright 2013 Mathew Winters

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

// Serializable version of MappingFile, leaves out the mapping data as we 
// have no need to pass 1mb+ over to the client.
public class MappingFileShared implements Serializable, IsSerializable
{
  /**
   * 
   */
  private static final long serialVersionUID = 8751499931836325827L;
  public MappingFileShared(){
  
  }
  
  public Long id;
  public Long Owner;
  public String apppackage;
  public String version;
  public Date uploadDate;
  
  @Override
  public String toString()
  {
    return "MappingFileShared [id=" + id + ", Owner=" + Owner + ", apppackage=" + apppackage + ", version=" + version + ", uploadDate=" + uploadDate + "]";
  }
}