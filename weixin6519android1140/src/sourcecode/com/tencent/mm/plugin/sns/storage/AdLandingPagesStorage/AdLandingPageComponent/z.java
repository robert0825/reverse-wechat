package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.gmtrace.GMTrace;
import java.io.Serializable;

public final class z
  implements Serializable
{
  public float height;
  public String iconUrl;
  public float pEC;
  public float width;
  
  public z()
  {
    GMTrace.i(8217614614528L, 61226);
    GMTrace.o(8217614614528L, 61226);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(8217748832256L, 61227);
    if (paramObject == this)
    {
      GMTrace.o(8217748832256L, 61227);
      return true;
    }
    if ((paramObject instanceof z))
    {
      paramObject = (z)paramObject;
      if ((((z)paramObject).iconUrl.equals(this.iconUrl)) && (((z)paramObject).width == this.width) && (((z)paramObject).height == this.height) && (((z)paramObject).pEC == this.pEC))
      {
        GMTrace.o(8217748832256L, 61227);
        return true;
      }
      GMTrace.o(8217748832256L, 61227);
      return false;
    }
    GMTrace.o(8217748832256L, 61227);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(8217883049984L, 61228);
    int i = super.hashCode();
    GMTrace.o(8217883049984L, 61228);
    return i;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */