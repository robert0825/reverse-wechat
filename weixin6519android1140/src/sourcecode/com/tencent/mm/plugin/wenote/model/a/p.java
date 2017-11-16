package com.tencent.mm.plugin.wenote.model.a;

import com.tencent.gmtrace.GMTrace;
import java.io.Serializable;

public final class p
  implements Serializable
{
  public boolean sdh;
  public long sdi;
  public long sdj;
  public boolean sdk;
  public String sdl;
  public String sdm;
  public int sdn;
  public int sdo;
  
  public p()
  {
    GMTrace.i(20603629207552L, 153509);
    this.sdh = false;
    this.sdi = -1L;
    this.sdj = -1L;
    this.sdk = false;
    this.sdl = "";
    this.sdm = "";
    this.sdn = 0;
    this.sdo = 0;
    GMTrace.o(20603629207552L, 153509);
  }
  
  public final String bGU()
  {
    GMTrace.i(20603763425280L, 153510);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("topIsOpenFromSession=").append(this.sdh).append(" topLocalId=").append(this.sdi).append(" topMsgId=").append(this.sdj).append(" topTitle=").append(this.sdl).append(" topNoteXml=").append(this.sdm).append(" topLastPosition=").append(this.sdn).append(" topLastOffset=").append(this.sdo);
    localObject = ((StringBuilder)localObject).toString();
    GMTrace.o(20603763425280L, 153510);
    return (String)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\a\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */