package org.xwalk.core.extension;

final class XWalkExternalExtensionBridgeFactory
{
  public static XWalkExternalExtensionBridge createInstance(XWalkExternalExtension paramXWalkExternalExtension)
  {
    return new XWalkCoreExtensionBridge(paramXWalkExternalExtension);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\extension\XWalkExternalExtensionBridgeFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */