package com.tencent.mm.plugin.mmsight.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.w;

public final class a
{
  public static void a(a parama)
  {
    GMTrace.i(20172119212032L, 150294);
    w.i("MicroMsg.VideoEditReporter", "[report-VideoEditCountData] %s", new Object[] { parama.toString() });
    g.ork.i(14529, new Object[] { Integer.valueOf(parama.scene), Integer.valueOf(parama.cfz) });
    GMTrace.o(20172119212032L, 150294);
  }
  
  public static final class a
  {
    int cfz;
    int scene;
    
    public a(int paramInt)
    {
      GMTrace.i(20172521865216L, 150297);
      this.cfz = 2;
      if (paramInt == 1)
      {
        this.scene = 1;
        GMTrace.o(20172521865216L, 150297);
        return;
      }
      if (paramInt == 2)
      {
        this.scene = 2;
        GMTrace.o(20172521865216L, 150297);
        return;
      }
      if (paramInt == 512)
      {
        this.cfz = 1;
        this.scene = 2;
        GMTrace.o(20172521865216L, 150297);
        return;
      }
      if (paramInt == 4) {
        this.scene = 4;
      }
      GMTrace.o(20172521865216L, 150297);
    }
    
    public final String toString()
    {
      GMTrace.i(20172656082944L, 150298);
      String str = "VideoEditCountData{scene=" + this.scene + ", source=" + this.cfz + '}';
      GMTrace.o(20172656082944L, 150298);
      return str;
    }
  }
  
  public static final class b
  {
    public int fMl;
    public boolean guN;
    public int ncZ;
    public int nda;
    public int ndb;
    public int ndc;
    public boolean ndd;
    public int nde;
    public int ndf;
    public int scene;
    public int textColor;
    
    public b(int paramInt)
    {
      GMTrace.i(20172253429760L, 150295);
      if (paramInt == 1)
      {
        this.scene = 2;
        GMTrace.o(20172253429760L, 150295);
        return;
      }
      if (paramInt == 2)
      {
        this.scene = 4;
        GMTrace.o(20172253429760L, 150295);
        return;
      }
      if (paramInt == 512)
      {
        this.scene = 3;
        GMTrace.o(20172253429760L, 150295);
        return;
      }
      if (paramInt == 4) {
        this.scene = 8;
      }
      GMTrace.o(20172253429760L, 150295);
    }
    
    public final String toString()
    {
      GMTrace.i(20172387647488L, 150296);
      String str = "VideoEditDetailData{scene=" + this.scene + ", isCancel=" + this.guN + ", rawDuration=" + this.ncZ + ", cropDuration=" + this.nda + ", emojiItemCount=" + this.ndb + ", textItemCount=" + this.ndc + ", isCrop=" + this.ndd + ", undoCount=" + this.fMl + ", doodleCount=" + this.nde + ", penColors=" + this.ndf + ", textColor=" + this.textColor + '}';
      GMTrace.o(20172387647488L, 150296);
      return str;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\mmsight\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */