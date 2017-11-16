package com.tencent.tmassistantsdk.network;

import com.tencent.tmassistantsdk.openSDK.opensdktomsdk.data.AuthorizedResult;

public abstract interface IGetAuthorizedHttpRequestListenner
{
  public abstract void onGetAuthorizedRequestFinished(AuthorizedResult paramAuthorizedResult, int paramInt);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tmassistantsdk\network\IGetAuthorizedHttpRequestListenner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */