/**
 * 
 */

package com.ingenium.goby.extractors;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author joviedo
 * @uml.annotations
 *     derived_abstraction="platform:/resource/goby-design/goby-classifier-extractor.emx#_REJYAEuNEeeV1tNCHYSKhw"
 * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_REJYAEuNEeeV1tNCHYSKhw"
 */
public abstract class ExtractorImpl implements Extractor {
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_ez4ecEuNEeeV1tNCHYSKhw"
  */
  private String source;
  /** 
  * <!-- begin-UML-doc -->
  * <!-- end-UML-doc -->
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_f-tS0EuNEeeV1tNCHYSKhw"
  */
  private String destination;

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the location of the destination file.</p>
  * <!-- end-UML-doc -->
  * @param destination <p>the new location of the destination file</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_h5u1EEuNEeeV1tNCHYSKhw"
  */
  @Override
  public void setDestination(String destination) {
    // begin-user-code
    this.destination = destination;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Sets the location of the source file.</p>
  * <!-- end-UML-doc -->
  * @param source <p>the new location of the source file</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_h5vcIEuNEeeV1tNCHYSKhw"
  */
  @Override
  public void setSource(String source) {
    // begin-user-code
    this.source = source;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Gets the location of the destination file.</p>
  * <!-- end-UML-doc -->
  * @return <p>the location of the destination file.</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_h5vcJEuNEeeV1tNCHYSKhw"
  */
  @Override
  public String getDestination() {
    // begin-user-code
    return destination;
    // end-user-code
  }

  /** 
  * <!-- begin-UML-doc -->
  * <p>Gets the location of the source file.</p>
  * <!-- end-UML-doc -->
  * @return <p>the location of the source file</p>
  * @generated "sourceid:platform:/resource/goby-design/goby-classifier-extractor.emx#_h5wDMEuNEeeV1tNCHYSKhw"
  */
  @Override
  public String getSource() {
    // begin-user-code
    return source;
    // end-user-code
  }
}