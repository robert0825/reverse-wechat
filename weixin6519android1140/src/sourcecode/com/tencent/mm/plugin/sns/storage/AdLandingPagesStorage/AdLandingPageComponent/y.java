package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent;

import com.tencent.gmtrace.GMTrace;
import java.util.ArrayList;
import java.util.List;

public final class y
  extends s
{
  public List<a> ozi;
  public String pEZ;
  public float pFa;
  public String pFb;
  public int pFc;
  public int pFd;
  public int pFe;
  public int pFf;
  public String pFg;
  
  public y()
  {
    GMTrace.i(8207682502656L, 61152);
    this.pEZ = "";
    this.pFb = "";
    this.pFg = "";
    this.ozi = new ArrayList();
    GMTrace.o(8207682502656L, 61152);
  }
  
  public final boolean equals(Object paramObject)
  {
    GMTrace.i(8207816720384L, 61153);
    if (paramObject == this)
    {
      GMTrace.o(8207816720384L, 61153);
      return true;
    }
    if ((paramObject instanceof y))
    {
      paramObject = (y)paramObject;
      if (((y)paramObject).pEZ == null)
      {
        if (this.pEZ != null) {
          break label171;
        }
        if (((y)paramObject).pFa != this.pFa) {
          break label171;
        }
        if (((y)paramObject).pFb != null) {
          break label181;
        }
        if (this.pFb != null) {
          break label171;
        }
        if ((((y)paramObject).pFc != this.pFc) || (((y)paramObject).pFd != this.pFd) || (((y)paramObject).pFe != this.pFe) || (((y)paramObject).pFf != this.pFf)) {
          break label171;
        }
        if (((y)paramObject).ozi != null) {
          break label198;
        }
        if (this.ozi != null) {
          break label171;
        }
        label133:
        if (((y)paramObject).pFg != null) {
          break label217;
        }
        if (this.pFg != null) {
          break label171;
        }
      }
      for (;;)
      {
        GMTrace.o(8207816720384L, 61153);
        return true;
        if (((y)paramObject).pEZ.equals(this.pEZ)) {
          break;
        }
        label171:
        label181:
        label198:
        label217:
        do
        {
          do
          {
            do
            {
              GMTrace.o(8207816720384L, 61153);
              return false;
            } while (!((y)paramObject).pFb.equals(this.pFb));
            break;
          } while (!((y)paramObject).ozi.equals(this.ozi));
          break label133;
        } while (!((y)paramObject).pFg.equals(this.pFg));
      }
    }
    GMTrace.o(8207816720384L, 61153);
    return false;
  }
  
  public final int hashCode()
  {
    GMTrace.i(8207950938112L, 61154);
    int i = super.hashCode();
    GMTrace.o(8207950938112L, 61154);
    return i;
  }
  
  public static final class a
  {
    public String label;
    public String pFh;
    public float value;
    
    public a()
    {
      GMTrace.i(8288750010368L, 61756);
      this.label = "";
      this.pFh = "";
      GMTrace.o(8288750010368L, 61756);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(8288884228096L, 61757);
      if (paramObject == this)
      {
        GMTrace.o(8288884228096L, 61757);
        return true;
      }
      if ((paramObject instanceof a))
      {
        paramObject = (a)paramObject;
        if ((((a)paramObject).label.equals(this.label)) && (((a)paramObject).pFh.equals(this.pFh)) && (((a)paramObject).value == this.value))
        {
          GMTrace.o(8288884228096L, 61757);
          return true;
        }
        GMTrace.o(8288884228096L, 61757);
        return false;
      }
      GMTrace.o(8288884228096L, 61757);
      return false;
    }
    
    public final int hashCode()
    {
      GMTrace.i(8289018445824L, 61758);
      int i = (int)(this.label.hashCode() + this.pFh.hashCode() + this.value);
      GMTrace.o(8289018445824L, 61758);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\storage\AdLandingPagesStorage\AdLandingPageComponent\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */