package com.tencent.mm.y;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;

public class bj
{
  private static bj goO;
  public final SharedPreferences ghC;
  
  private bj()
  {
    GMTrace.i(13155753263104L, 98018);
    this.ghC = ab.getContext().getSharedPreferences(ab.bPU(), 0);
    GMTrace.o(13155753263104L, 98018);
  }
  
  public static bj BC()
  {
    GMTrace.i(13155887480832L, 98019);
    try
    {
      if (goO == null) {
        goO = new bj();
      }
      bj localbj = goO;
      GMTrace.o(13155887480832L, 98019);
      return localbj;
    }
    finally {}
  }
  
  public final int BD()
  {
    GMTrace.i(20304994762752L, 151284);
    int i = this.ghC.getInt("MicroMsg.RegStyleStoragenew_flow", 1);
    GMTrace.o(20304994762752L, 151284);
    return i;
  }
  
  public static final class a
  {
    private int goP;
    private int goQ;
    private int goR;
    private int id;
    
    public a()
    {
      GMTrace.i(13155082174464L, 98013);
      GMTrace.o(13155082174464L, 98013);
    }
    
    public final boolean commit()
    {
      GMTrace.i(13155619045376L, 98017);
      SharedPreferences.Editor localEditor = bj.BC().ghC.edit();
      if (this.id > 0)
      {
        localEditor.putInt("MicroMsg.RegStyleStoragestyle_id", this.id);
        if (this.goP <= 0) {
          break label189;
        }
        localEditor.putInt("MicroMsg.RegStyleStoragenew_flow", this.goP);
        label60:
        if (this.goQ <= 0) {
          break label202;
        }
        localEditor.putInt("MicroMsg.RegStyleStoragehas_password", this.goQ);
        label80:
        if (this.goR <= 0) {
          break label214;
        }
        localEditor.putInt("MicroMsg.RegStyleStoragehas_AVATAR", this.goR);
      }
      for (;;)
      {
        w.i("MicroMsg.RegStyleStorage", "id: " + this.id + " newFlow: " + this.goP + "hasPassword:" + this.goQ + "hasAvatar:" + this.goR);
        boolean bool = localEditor.commit();
        GMTrace.o(13155619045376L, 98017);
        return bool;
        localEditor.remove("MicroMsg.RegStyleStoragestyle_id");
        break;
        label189:
        localEditor.putInt("MicroMsg.RegStyleStoragenew_flow", 0);
        break label60;
        label202:
        localEditor.remove("MicroMsg.RegStyleStoragehas_password");
        break label80;
        label214:
        localEditor.remove("MicroMsg.RegStyleStoragehas_AVATAR");
      }
    }
    
    public final a fB(int paramInt)
    {
      GMTrace.i(13155216392192L, 98014);
      this.goP = paramInt;
      GMTrace.o(13155216392192L, 98014);
      return this;
    }
    
    public final a fC(int paramInt)
    {
      GMTrace.i(13155350609920L, 98015);
      this.goQ = paramInt;
      GMTrace.o(13155350609920L, 98015);
      return this;
    }
    
    public final a fD(int paramInt)
    {
      GMTrace.i(13155484827648L, 98016);
      this.goR = paramInt;
      GMTrace.o(13155484827648L, 98016);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\y\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */