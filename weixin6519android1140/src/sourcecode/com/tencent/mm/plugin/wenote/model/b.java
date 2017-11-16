package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.res.AssetManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.e;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.g.a.ae;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public final class b
  implements aq
{
  private static HashMap<Integer, g.d> fIv;
  private com.tencent.mm.sdk.b.c hPq;
  public c sbA;
  private com.tencent.mm.plugin.wenote.a.c sbx;
  private com.tencent.mm.plugin.wenote.a.a sby;
  private com.tencent.mm.plugin.wenote.a.b sbz;
  
  static
  {
    GMTrace.i(5661437984768L, 42181);
    fIv = new HashMap();
    GMTrace.o(5661437984768L, 42181);
  }
  
  public b()
  {
    GMTrace.i(5660230025216L, 42172);
    this.sbx = new com.tencent.mm.plugin.wenote.a.c();
    this.sby = new com.tencent.mm.plugin.wenote.a.a();
    this.sbz = new com.tencent.mm.plugin.wenote.a.b();
    this.sbA = null;
    this.hPq = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(5660230025216L, 42172);
  }
  
  private static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    GMTrace.i(5661303767040L, 42180);
    byte[] arrayOfByte = new byte['Ѐ'];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
    GMTrace.o(5661303767040L, 42180);
  }
  
  public static b bGM()
  {
    GMTrace.i(5660364242944L, 42173);
    b localb2 = (b)at.AK().gZ("plugin.wenote");
    b localb1 = localb2;
    if (localb2 == null)
    {
      localb1 = new b();
      at.AK().a("plugin.wenote", localb1);
    }
    GMTrace.o(5660364242944L, 42173);
    return localb1;
  }
  
  public final void aX(boolean paramBoolean)
  {
    GMTrace.i(5660766896128L, 42176);
    w.d("MicroMsg.SubCoreWNNoteMsg", "on account post reset");
    com.tencent.mm.sdk.b.a.vgX.b(this.sbx);
    com.tencent.mm.sdk.b.a.vgX.b(this.sby);
    com.tencent.mm.sdk.b.a.vgX.b(this.sbz);
    com.tencent.mm.sdk.b.a.vgX.b(this.hPq);
    Object localObject1 = new File(i.zm());
    if ((!((File)localObject1).exists()) || (!((File)localObject1).isDirectory()))
    {
      w.d("MicroMsg.SubCoreWNNoteMsg", "record stg dir[%s] not exsit, create it");
      ((File)localObject1).mkdirs();
    }
    Object localObject2 = new File(com.tencent.mm.bf.a.Op());
    w.i("MicroMsg.SubCoreWNNoteMsg", "copy to path %s", new Object[] { ((File)localObject2).getAbsolutePath() });
    if ((d.tJF) || (d.tJG))
    {
      w.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile develop version delete template");
      e.f((File)localObject2);
    }
    int i;
    InputStream localInputStream;
    File localFile;
    for (;;)
    {
      if (!((File)localObject2).exists()) {
        ((File)localObject2).mkdirs();
      }
      localObject1 = ab.getContext().getAssets();
      try
      {
        localObject1 = ((AssetManager)localObject1).open("WNNote.zip");
        if (localObject1 == null)
        {
          w.e("MicroMsg.SubCoreWNNoteMsg", "file inputStream not found");
          GMTrace.o(5660766896128L, 42176);
          return;
          com.tencent.mm.bf.a.hgd = com.tencent.mm.bf.a.GL();
          if (paramBoolean)
          {
            i = com.tencent.mm.bf.a.GM();
            w.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile need update assetVersion=%d currentVersion=%d", new Object[] { Integer.valueOf(i), Integer.valueOf(com.tencent.mm.bf.a.hgd) });
            if (com.tencent.mm.bf.a.hgd >= i) {
              continue;
            }
            e.f((File)localObject2);
            continue;
          }
          if (com.tencent.mm.bf.a.hgd == 1)
          {
            w.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile need init template");
            e.f((File)localObject2);
            continue;
          }
          w.i("MicroMsg.SubCoreWNNoteMsg", "copyAssertTemplateFile currentVersion=%d", new Object[] { Integer.valueOf(com.tencent.mm.bf.a.hgd) });
        }
      }
      catch (IOException localIOException1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localIOException1, "", new Object[0]);
          localInputStream = null;
        }
        localFile = new File((File)localObject2, "WNNote.zip");
        if (localFile.exists())
        {
          w.i("MicroMsg.SubCoreWNNoteMsg", "wenote template already exists");
          e.b(localInputStream);
          GMTrace.o(5660766896128L, 42176);
          return;
        }
      }
    }
    try
    {
      localObject2 = new FileOutputStream(localFile);
      if (localObject2 == null) {}
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      try
      {
        a(localInputStream, (OutputStream)localObject2);
        e.b(localInputStream);
        e.a((OutputStream)localObject2);
        i = bg.eV(localFile.getAbsolutePath(), localFile.getParent());
        if (i < 0) {
          w.e("MicroMsg.SubCoreWNNoteMsg", "unzip fail, ret = " + i + ", zipFilePath = " + localFile.getAbsolutePath() + ", unzipPath = " + localFile.getParent());
        }
        GMTrace.o(5660766896128L, 42176);
        return;
        localFileNotFoundException = localFileNotFoundException;
        w.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localFileNotFoundException, "", new Object[0]);
        Object localObject3 = null;
      }
      catch (IOException localIOException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.SubCoreWNNoteMsg", localIOException2, "", new Object[0]);
        }
      }
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(5660901113856L, 42177);
    GMTrace.o(5660901113856L, 42177);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(5660632678400L, 42175);
    GMTrace.o(5660632678400L, 42175);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(5661035331584L, 42178);
    w.d("MicroMsg.SubCoreWNNoteMsg", "on account post release");
    com.tencent.mm.sdk.b.a.vgX.c(this.sbx);
    com.tencent.mm.sdk.b.a.vgX.c(this.sby);
    com.tencent.mm.sdk.b.a.vgX.c(this.sbz);
    com.tencent.mm.sdk.b.a.vgX.c(this.hPq);
    GMTrace.o(5661035331584L, 42178);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(5660498460672L, 42174);
    HashMap localHashMap = fIv;
    GMTrace.o(5660498460672L, 42174);
    return localHashMap;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */