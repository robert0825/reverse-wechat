package com.tencent.mm.console.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Environment;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsfs.SFSContext.Statistics;
import com.tencent.mm.pluginsdk.b.a;
import com.tencent.mm.pluginsdk.b.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
  implements a
{
  static
  {
    GMTrace.i(419833053184L, 3128);
    b.a(new e(), new String[] { "//disablesfs", "//exportsfs", "//sfsstat" });
    GMTrace.o(419833053184L, 3128);
  }
  
  public e()
  {
    GMTrace.i(419430400000L, 3125);
    GMTrace.o(419430400000L, 3125);
  }
  
  public static void init()
  {
    GMTrace.i(419564617728L, 3126);
    GMTrace.o(419564617728L, 3126);
  }
  
  public final boolean a(Context paramContext, String[] paramArrayOfString)
  {
    GMTrace.i(419698835456L, 3127);
    Object localObject = paramArrayOfString[0];
    switch (((String)localObject).hashCode())
    {
    default: 
      label52:
      i = -1;
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        GMTrace.o(419698835456L, 3127);
        return false;
        if (!((String)localObject).equals("//disablesfs")) {
          break label52;
        }
        i = 0;
        continue;
        if (!((String)localObject).equals("//exportsfs")) {
          break label52;
        }
        i = 1;
        continue;
        if (!((String)localObject).equals("//sfsstat")) {
          break label52;
        }
        i = 2;
      }
    }
    localObject = new File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/tencent/MicroMsg/disable-sfs");
    try
    {
      if ((paramArrayOfString.length > 0) && (!paramArrayOfString[1].equals("0"))) {
        ((File)localObject).createNewFile();
      }
      for (;;)
      {
        paramArrayOfString = new StringBuilder("Use SFS: ");
        if (((File)localObject).exists()) {
          break;
        }
        bool = true;
        Toast.makeText(paramContext, Boolean.toString(bool), 0).show();
        GMTrace.o(419698835456L, 3127);
        return true;
        ((File)localObject).delete();
      }
    }
    catch (Exception paramArrayOfString)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.SFSCommand", paramArrayOfString, "Failed to operate flag file.", new Object[0]);
        continue;
        boolean bool = false;
      }
    }
    if (paramArrayOfString.length <= 1)
    {
      GMTrace.o(419698835456L, 3127);
      return false;
    }
    paramArrayOfString = paramArrayOfString[1];
    FileOp.kW(paramArrayOfString);
    Toast.makeText(paramContext, paramArrayOfString, 0).show();
    GMTrace.o(419698835456L, 3127);
    return true;
    long l1 = System.currentTimeMillis();
    localObject = FileOp.KX();
    paramArrayOfString = new StringBuilder(8192);
    localObject = ((Map)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      paramArrayOfString.append("===== ").append((String)localEntry.getKey()).append(" =====\n").append(((SFSContext.Statistics)localEntry.getValue()).toString()).append("\n\n");
    }
    long l2 = System.currentTimeMillis();
    paramArrayOfString.append("elapsed: ").append(l2 - l1).append(" ms");
    localObject = new TextView(paramContext);
    ((TextView)localObject).setText(paramArrayOfString);
    ((TextView)localObject).setGravity(8388627);
    ((TextView)localObject).setTextSize(1, 10.0F);
    ((TextView)localObject).setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    ((TextView)localObject).setTextColor(-16744704);
    ((TextView)localObject).setTypeface(Typeface.MONOSPACE);
    ((TextView)localObject).setMovementMethod(new ScrollingMovementMethod());
    int i = paramContext.getResources().getDimensionPixelSize(R.f.aQq);
    ((TextView)localObject).setPadding(i, i, i, i);
    h.a(paramContext, null, (View)localObject, null);
    GMTrace.o(419698835456L, 3127);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\console\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */