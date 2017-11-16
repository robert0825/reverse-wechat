package org.xwalk.core.extension;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public abstract interface XWalkExtensionContextClient
{
  public abstract void broadcastMessage(XWalkExternalExtension paramXWalkExternalExtension, String paramString);
  
  public abstract Activity getActivity();
  
  public abstract Context getContext();
  
  public abstract void postBinaryMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, byte[] paramArrayOfByte);
  
  public abstract void postMessage(XWalkExternalExtension paramXWalkExternalExtension, int paramInt, String paramString);
  
  public abstract void registerExtension(XWalkExternalExtension paramXWalkExternalExtension);
  
  public abstract void startActivityForResult(Intent paramIntent, int paramInt, Bundle paramBundle);
  
  public abstract void unregisterExtension(String paramString);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\org\xwalk\core\extension\XWalkExtensionContextClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */