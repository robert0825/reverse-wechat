package com.tencent.mm.plugin.hp.tinker;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.hp.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.tinker.lib.d.d;
import com.tencent.tinker.loader.shareutil.SharePatchFileUtil;
import com.tencent.tinker.loader.shareutil.ShareTinkerInternals;
import java.io.File;

public final class c
  extends com.tencent.tinker.lib.c.a
{
  public c(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(5753242910720L, 42865);
    GMTrace.o(5753242910720L, 42865);
  }
  
  private void aHs()
  {
    GMTrace.i(16028281077760L, 119420);
    new a(this.context, new a.a()
    {
      public final void aHr()
      {
        GMTrace.i(16029354819584L, 119428);
        if (c.this.cqH()) {
          b.aHl();
        }
        GMTrace.o(16029354819584L, 119428);
      }
    });
    GMTrace.o(16028281077760L, 119420);
  }
  
  public final void a(File paramFile, int paramInt)
  {
    GMTrace.i(5753511346176L, 42867);
    super.a(paramFile, paramInt);
    b.pi(paramInt);
    GMTrace.o(5753511346176L, 42867);
  }
  
  public final void a(File paramFile, int paramInt, long paramLong)
  {
    GMTrace.i(5754182434816L, 42872);
    super.a(paramFile, paramInt, paramLong);
    switch (paramInt)
    {
    default: 
      if (!com.tencent.tinker.lib.d.a.hQ(this.context).qoU) {
        com.tencent.tinker.lib.e.a.w("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad retry is not main process, just return", new Object[0]);
      }
      break;
    }
    for (;;)
    {
      w.d("Tinker.TinkerPatchLoadReporter", "onLoadResult loadcode:%d icost:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(paramLong) });
      if (paramInt == 0)
      {
        Object localObject = com.tencent.tinker.lib.d.a.hQ(this.context).ygx;
        w.i("Tinker.TinkerPatchLoadReporter", "onLoadResult currentVersion:%s", new Object[] { ((d)localObject).ygC });
        if (!TextUtils.isEmpty(((d)localObject).ygC))
        {
          paramFile = this.context;
          localObject = ((d)localObject).ygC;
          paramFile.getSharedPreferences("tinker_patch_share_config", 4).edit().putString("tinker_patch_version_key", (String)localObject).apply();
        }
      }
      GMTrace.o(5754182434816L, 42872);
      return;
      b.h(paramLong, com.tencent.tinker.lib.d.a.hQ(this.context).qoU);
      break;
      paramFile = new File(SharePatchFileUtil.hZ(this.context), "temp.apk").getAbsolutePath();
      if ((paramFile == null) || (!new File(paramFile).exists())) {
        com.tencent.tinker.lib.e.a.w("Tinker.TinkerPatchLoadReporter", "onPatchRetryLoad patch file: %s is not exist, just return", new Object[] { paramFile });
      } else {
        new a(this.context, new a.a()
        {
          public final void aHr()
          {
            GMTrace.i(16029220601856L, 119427);
            if (com.tencent.tinker.lib.e.c.hV(c.this.context).cqJ()) {
              b.aHl();
            }
            GMTrace.o(16029220601856L, 119427);
          }
        });
      }
    }
  }
  
  public final void a(File paramFile, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(5753645563904L, 42868);
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadFileNotFound: patch file not found: %s, fileType:%d, isDirectory:%b", new Object[] { paramFile.getAbsolutePath(), Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
    if (paramInt == 4) {
      aHs();
    }
    for (;;)
    {
      if (paramInt == 1)
      {
        paramFile = com.tencent.tinker.lib.d.a.hQ(this.context).ygx;
        if ((paramFile.ygC != null) && ("00000000000000000000000000000000".equals(paramFile.ygC)))
        {
          com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchLoadReporter", "Roll back patch when restarting main process, restart all other process also!", new Object[0]);
          ShareTinkerInternals.ih(this.context);
        }
      }
      b.ph(paramInt);
      GMTrace.o(5753645563904L, 42868);
      return;
      cqG();
    }
  }
  
  public final void a(String paramString1, String paramString2, File paramFile)
  {
    GMTrace.i(5753913999360L, 42870);
    super.a(paramString1, paramString2, paramFile);
    b.aHo();
    GMTrace.o(5753913999360L, 42870);
  }
  
  public final void a(String paramString1, String paramString2, File paramFile, String paramString3)
  {
    GMTrace.i(5754048217088L, 42871);
    super.a(paramString1, paramString2, paramFile, paramString3);
    b.aHp();
    GMTrace.o(5754048217088L, 42871);
  }
  
  public final void a(Throwable paramThrowable, int paramInt)
  {
    GMTrace.i(5753377128448L, 42866);
    super.a(paramThrowable, paramInt);
    b.a(paramThrowable, paramInt);
    GMTrace.o(5753377128448L, 42866);
  }
  
  public final void b(int paramInt, Throwable paramThrowable)
  {
    GMTrace.i(16028146860032L, 119419);
    com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret: type: %d, throwable: %s", new Object[] { Integer.valueOf(paramInt), paramThrowable });
    switch (paramInt)
    {
    }
    for (;;)
    {
      aHs();
      b.a(paramInt, paramThrowable);
      GMTrace.o(16028146860032L, 119419);
      return;
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, can get instruction set from existed oat file", new Object[0]);
      continue;
      com.tencent.tinker.lib.e.a.e("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret fail, command line to interpret return error", new Object[0]);
      continue;
      com.tencent.tinker.lib.e.a.i("Tinker.TinkerPatchLoadReporter", "patch loadReporter onLoadInterpret ok", new Object[0]);
    }
  }
  
  public final void b(File paramFile, int paramInt)
  {
    GMTrace.i(5753779781632L, 42869);
    super.b(paramFile, paramInt);
    b.k(ab.vin, paramInt);
    GMTrace.o(5753779781632L, 42869);
  }
  
  public final void c(File paramFile, int paramInt)
  {
    GMTrace.i(5754316652544L, 42873);
    super.c(paramFile, paramInt);
    if ((paramInt == -26) || (paramInt == -5))
    {
      ShareTinkerInternals.id(this.context);
      com.tencent.tinker.lib.d.a.hQ(this.context).tinkerFlags = 0;
    }
    b.pe(paramInt);
    GMTrace.o(5754316652544L, 42873);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\tinker\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */