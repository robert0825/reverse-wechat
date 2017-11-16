package com.tencent.tinker.lib.d;

import android.content.Context;
import com.tencent.tinker.lib.c.c;
import com.tencent.tinker.loader.TinkerRuntimeException;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import java.io.File;

public class a
{
  private static a ygo;
  public static boolean ygp = false;
  public final Context context;
  public final boolean qoU;
  public int tinkerFlags;
  final boolean tinkerLoadVerifyFlag;
  public final File ygq;
  final com.tencent.tinker.lib.a.b ygr;
  public final c ygs;
  public final com.tencent.tinker.lib.c.d ygt;
  public final File ygu;
  public final File ygv;
  public final boolean ygw;
  public d ygx;
  public boolean ygy = false;
  
  public a(Context paramContext, int paramInt, c paramc, com.tencent.tinker.lib.c.d paramd, com.tencent.tinker.lib.a.b paramb, File paramFile1, File paramFile2, File paramFile3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    this.context = paramContext;
    this.ygr = paramb;
    this.ygs = paramc;
    this.ygt = paramd;
    this.tinkerFlags = paramInt;
    this.ygq = paramFile1;
    this.ygu = paramFile2;
    this.ygv = paramFile3;
    this.qoU = paramBoolean1;
    this.tinkerLoadVerifyFlag = paramBoolean3;
    this.ygw = paramBoolean2;
  }
  
  public static void a(a parama)
  {
    if (ygo != null) {
      throw new TinkerRuntimeException("Tinker instance is already set.");
    }
    ygo = parama;
  }
  
  public static a hQ(Context paramContext)
  {
    if (!ygp) {
      throw new TinkerRuntimeException("you must install tinker before get tinker sInstance");
    }
    if (ygo == null) {}
    try
    {
      if (ygo == null) {
        ygo = new a(paramContext).cqI();
      }
      return ygo;
    }
    finally {}
  }
  
  public final void U(File paramFile)
  {
    if ((this.ygq == null) || (paramFile == null) || (!paramFile.exists())) {}
    do
    {
      return;
      paramFile = SharePatchFileUtil.YG(SharePatchFileUtil.ac(paramFile));
    } while ((this.ygq == null) || (paramFile == null));
    SharePatchFileUtil.ba(this.ygq.getAbsolutePath() + "/" + paramFile);
  }
  
  public final void aHu()
  {
    if (this.ygq == null) {
      return;
    }
    if (this.ygy) {
      com.tencent.tinker.lib.e.a.e("Tinker.Tinker", "it is not safety to clean patch when tinker is loaded, you should kill all your process after clean!", new Object[0]);
    }
    SharePatchFileUtil.f(this.ygq);
  }
  
  public static final class a
  {
    private final Context context;
    public int status = -1;
    private final boolean ygA;
    public Boolean ygB;
    private File ygq;
    public com.tencent.tinker.lib.a.b ygr;
    public c ygs;
    public com.tencent.tinker.lib.c.d ygt;
    private File ygu;
    private File ygv;
    private final boolean ygz;
    
    public a(Context paramContext)
    {
      if (paramContext == null) {
        throw new TinkerRuntimeException("Context must not be null.");
      }
      this.context = paramContext;
      this.ygz = com.tencent.tinker.lib.e.b.jdMethod_if(paramContext);
      this.ygA = com.tencent.tinker.lib.e.b.hU(paramContext);
      this.ygq = SharePatchFileUtil.hY(paramContext);
      if (this.ygq == null)
      {
        com.tencent.tinker.lib.e.a.e("Tinker.Tinker", "patchDirectory is null!", new Object[0]);
        return;
      }
      this.ygu = SharePatchFileUtil.YE(this.ygq.getAbsolutePath());
      this.ygv = SharePatchFileUtil.YF(this.ygq.getAbsolutePath());
      com.tencent.tinker.lib.e.a.w("Tinker.Tinker", "tinker patch directory: %s", new Object[] { this.ygq });
    }
    
    public final a cqI()
    {
      if (this.status == -1) {
        this.status = 7;
      }
      if (this.ygs == null) {
        this.ygs = new com.tencent.tinker.lib.c.a(this.context);
      }
      if (this.ygt == null) {
        this.ygt = new com.tencent.tinker.lib.c.b(this.context);
      }
      if (this.ygr == null) {
        this.ygr = new com.tencent.tinker.lib.a.a(this.context);
      }
      if (this.ygB == null) {
        this.ygB = Boolean.valueOf(false);
      }
      return new a(this.context, this.status, this.ygs, this.ygt, this.ygr, this.ygq, this.ygu, this.ygv, this.ygz, this.ygA, this.ygB.booleanValue());
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\tinker\lib\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */