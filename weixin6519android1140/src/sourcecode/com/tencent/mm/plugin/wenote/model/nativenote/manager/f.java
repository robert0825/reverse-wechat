package com.tencent.mm.plugin.wenote.model.nativenote.manager;

import android.content.Context;
import android.text.ClipboardManager;
import android.text.Spanned;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.wenote.model.nativenote.a.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class f
{
  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.b> iBZ;
  private static String sew;
  
  public static void Ty()
  {
    GMTrace.i(17237851242496L, 128432);
    if (iBZ != null) {
      iBZ.clear();
    }
    sew = "";
    com.tencent.mm.bf.a.hgc = null;
    GMTrace.o(17237851242496L, 128432);
  }
  
  public static ArrayList<com.tencent.mm.plugin.wenote.model.a.b> bHC()
  {
    GMTrace.i(17237582807040L, 128430);
    ArrayList localArrayList = new ArrayList();
    if (iBZ == null)
    {
      GMTrace.o(17237582807040L, 128430);
      return localArrayList;
    }
    Iterator localIterator = iBZ.iterator();
    label185:
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.wenote.model.a.b localb = com.tencent.mm.plugin.wenote.b.b.c((com.tencent.mm.plugin.wenote.model.a.b)localIterator.next());
      int j;
      if (localb == null) {
        j = 0;
      }
      for (;;)
      {
        if (j == 0) {
          break label185;
        }
        localArrayList.add(localb);
        break;
        j = 1;
        int k = localb.getType();
        int i;
        String str;
        if ((k != 2) && (k != 6) && (k != 4))
        {
          i = j;
          if (k != 5) {}
        }
        else
        {
          str = com.tencent.mm.plugin.wenote.b.b.d(localb);
          if (!bg.nm(str))
          {
            i = j;
            if (FileOp.aZ(str)) {}
          }
          else
          {
            i = 0;
          }
        }
        if (k != 2)
        {
          j = i;
          if (k != 6) {}
        }
        else
        {
          str = com.tencent.mm.plugin.wenote.b.b.e(localb);
          if (!bg.nm(str))
          {
            j = i;
            if (FileOp.aZ(str)) {}
          }
          else
          {
            j = 0;
          }
        }
      }
    }
    GMTrace.o(17237582807040L, 128430);
    return localArrayList;
  }
  
  public static void c(Context paramContext, ArrayList<com.tencent.mm.plugin.wenote.model.a.b> paramArrayList)
  {
    GMTrace.i(20634901938176L, 153742);
    if (iBZ != null) {
      iBZ.clear();
    }
    iBZ = paramArrayList;
    paramArrayList = new HashSet();
    if (iBZ != null)
    {
      Iterator localIterator = iBZ.iterator();
      while (localIterator.hasNext())
      {
        Object localObject = (com.tencent.mm.plugin.wenote.model.a.b)localIterator.next();
        String str = com.tencent.mm.plugin.wenote.b.b.d((com.tencent.mm.plugin.wenote.model.a.b)localObject);
        if (!bg.nm(str)) {
          paramArrayList.add(str);
        }
        localObject = com.tencent.mm.plugin.wenote.b.b.e((com.tencent.mm.plugin.wenote.model.a.b)localObject);
        if (!bg.nm((String)localObject)) {
          paramArrayList.add(localObject);
        }
      }
    }
    com.tencent.mm.bf.a.hgc = paramArrayList;
    paramArrayList = new StringBuilder("");
    if (iBZ != null)
    {
      int i = 0;
      if (i < iBZ.size())
      {
        if (i != iBZ.size() - 1) {
          paramArrayList.append(com.tencent.mm.plugin.wenote.b.b.a(paramContext, (com.tencent.mm.plugin.wenote.model.a.b)iBZ.get(i))).append("<br/>");
        }
        for (;;)
        {
          i += 1;
          break;
          paramArrayList.append(com.tencent.mm.plugin.wenote.b.b.a(paramContext, (com.tencent.mm.plugin.wenote.model.a.b)iBZ.get(i)));
        }
      }
    }
    sew = com.tencent.mm.plugin.wenote.b.b.NQ(paramArrayList.toString());
    paramContext = (ClipboardManager)paramContext.getSystemService("clipboard");
    if (paramContext != null) {
      paramContext.setText(a.NF(sew));
    }
    GMTrace.o(20634901938176L, 153742);
  }
  
  public static boolean dy(Context paramContext)
  {
    GMTrace.i(20635036155904L, 153743);
    paramContext = (ClipboardManager)paramContext.getSystemService("clipboard");
    if (paramContext.getText().length() >= 16384)
    {
      GMTrace.o(20635036155904L, 153743);
      return true;
    }
    if (com.tencent.mm.plugin.wenote.b.b.NO(paramContext.getText().toString()) >= 16384)
    {
      GMTrace.o(20635036155904L, 153743);
      return true;
    }
    GMTrace.o(20635036155904L, 153743);
    return false;
  }
  
  public static int dz(Context paramContext)
  {
    GMTrace.i(20635170373632L, 153744);
    paramContext = (ClipboardManager)paramContext.getSystemService("clipboard");
    if ((paramContext == null) || (paramContext.getText() == null) || (paramContext.getText().length() <= 0)) {}
    for (int i = 1;; i = 0)
    {
      if ((iBZ == null) || (iBZ.size() <= 0)) {}
      for (int j = 1;; j = 0)
      {
        if ((i != 0) && (j != 0))
        {
          GMTrace.o(20635170373632L, 153744);
          return 1;
        }
        if ((i == 0) && (j != 0))
        {
          GMTrace.o(20635170373632L, 153744);
          return 2;
        }
        if (i != 0)
        {
          GMTrace.o(20635170373632L, 153744);
          return 3;
        }
        try
        {
          paramContext = paramContext.getText();
          if ((paramContext instanceof Spanned)) {}
          for (paramContext = com.tencent.mm.plugin.wenote.model.nativenote.a.b.a((Spanned)paramContext); paramContext.equals(sew); paramContext = paramContext.toString())
          {
            GMTrace.o(20635170373632L, 153744);
            return 3;
          }
        }
        catch (Exception paramContext)
        {
          for (;;)
          {
            w.e("WNNoteClipboardManager", "get clipboard data error : ", new Object[] { paramContext });
            paramContext = "";
          }
          GMTrace.o(20635170373632L, 153744);
          return 2;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\model\nativenote\manager\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */