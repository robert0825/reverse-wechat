package com.tencent.mm.plugin.label.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.af.m;
import com.tencent.mm.g.b.af;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.AddressView;
import com.tencent.mm.ui.contact.f;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import java.util.List;
import java.util.Map;

public final class a
  extends o<f>
{
  public static final ColorStateList mvB;
  public static final ColorStateList mvC;
  List<String> mvD;
  
  static
  {
    GMTrace.i(7300773314560L, 54395);
    mvB = com.tencent.mm.br.a.U(ab.getContext(), R.e.aOq);
    mvC = com.tencent.mm.br.a.U(ab.getContext(), R.e.aOa);
    GMTrace.o(7300773314560L, 54395);
  }
  
  public a(Context paramContext)
  {
    super(paramContext, new f());
    GMTrace.i(7299431137280L, 54385);
    GMTrace.o(7299431137280L, 54385);
  }
  
  private static f a(f paramf, Cursor paramCursor)
  {
    GMTrace.i(7300236443648L, 54391);
    f localf = paramf;
    if (paramf == null) {
      localf = new f();
    }
    at.AR();
    paramf = c.yK().Tz(x.h(paramCursor));
    if (paramf == null)
    {
      localf.iBi.b(paramCursor);
      at.AR();
      c.yK().O(localf.iBi);
    }
    for (;;)
    {
      GMTrace.o(7300236443648L, 54391);
      return localf;
      localf.iBi = paramf;
    }
  }
  
  /* Error */
  public final void QF()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc2_w 110
    //   5: ldc 112
    //   7: invokestatic 27	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   10: invokestatic 118	android/os/Looper:myLooper	()Landroid/os/Looper;
    //   13: invokestatic 121	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   16: if_acmpne +61 -> 77
    //   19: iconst_1
    //   20: istore_1
    //   21: aload_0
    //   22: getfield 123	com/tencent/mm/plugin/label/ui/a:mvD	Ljava/util/List;
    //   25: ifnull +57 -> 82
    //   28: aload_0
    //   29: getfield 123	com/tencent/mm/plugin/label/ui/a:mvD	Ljava/util/List;
    //   32: invokeinterface 129 1 0
    //   37: ifle +45 -> 82
    //   40: invokestatic 78	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   43: pop
    //   44: invokestatic 84	com/tencent/mm/y/c:yK	()Lcom/tencent/mm/storage/ar;
    //   47: aload_0
    //   48: getfield 123	com/tencent/mm/plugin/label/ui/a:mvD	Ljava/util/List;
    //   51: invokeinterface 133 2 0
    //   56: astore_2
    //   57: iload_1
    //   58: ifeq +31 -> 89
    //   61: aload_0
    //   62: aload_2
    //   63: invokevirtual 136	com/tencent/mm/plugin/label/ui/a:f	(Landroid/database/Cursor;)V
    //   66: ldc2_w 110
    //   69: ldc 112
    //   71: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   74: aload_0
    //   75: monitorexit
    //   76: return
    //   77: iconst_0
    //   78: istore_1
    //   79: goto -58 -> 21
    //   82: invokestatic 142	com/tencent/mm/bu/c:bVe	()Landroid/database/Cursor;
    //   85: astore_2
    //   86: goto -29 -> 57
    //   89: new 7	com/tencent/mm/plugin/label/ui/a$1
    //   92: dup
    //   93: aload_0
    //   94: aload_2
    //   95: invokespecial 145	com/tencent/mm/plugin/label/ui/a$1:<init>	(Lcom/tencent/mm/plugin/label/ui/a;Landroid/database/Cursor;)V
    //   98: invokestatic 151	com/tencent/mm/sdk/platformtools/af:t	(Ljava/lang/Runnable;)V
    //   101: ldc2_w 110
    //   104: ldc 112
    //   106: invokestatic 55	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   109: goto -35 -> 74
    //   112: astore_2
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_2
    //   116: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	a
    //   20	59	1	i	int
    //   56	39	2	localCursor	Cursor
    //   112	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	19	112	finally
    //   21	57	112	finally
    //   61	74	112	finally
    //   82	86	112	finally
    //   89	109	112	finally
  }
  
  protected final void QG()
  {
    GMTrace.i(7300102225920L, 54390);
    QF();
    GMTrace.o(7300102225920L, 54390);
  }
  
  public final void f(Cursor paramCursor)
  {
    GMTrace.i(7300370661376L, 54392);
    aJe();
    setCursor(paramCursor);
    notifyDataSetChanged();
    GMTrace.o(7300370661376L, 54392);
  }
  
  public final int getCount()
  {
    GMTrace.i(7299565355008L, 54386);
    int i = super.getCount();
    GMTrace.o(7299565355008L, 54386);
    return i;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    localObject = null;
    GMTrace.i(7299833790464L, 54388);
    x localx = pG(paramInt).iBi;
    View localView;
    if ((paramView == null) || (paramView.getTag() == null))
    {
      localView = View.inflate(this.context, R.i.ctP, null);
      paramViewGroup = new a(localView);
      localView.setTag(paramViewGroup);
      a.b.a(paramViewGroup.mvG, localx.field_username);
      if (localx.field_verifyFlag == 0) {
        break label327;
      }
      paramView = ak.a.gmZ.fs(localx.field_verifyFlag);
      if (paramView == null) {
        break label316;
      }
      paramView = m.iX(paramView);
      paramViewGroup.mvG.setMaskBitmap(paramView);
      label112:
      if (localx.field_deleteFlag != 1) {
        break label338;
      }
      paramViewGroup.mvG.setNickNameTextColor(mvC);
      label131:
      paramViewGroup.mvG.updateTextColors();
      paramView = localx.vpn;
      if (paramView != null) {
        break label351;
      }
    }
    try
    {
      Context localContext = this.context;
      paramView = localx.field_username;
      String str = r.fs(localx.field_username);
      paramView = str;
      if ("".length() > 0)
      {
        paramView = str;
        if (!"".equals(str))
        {
          paramView = new StringBuilder(32);
          paramView.append(str);
          paramView.append("(");
          paramView.append("");
          paramView.append(")");
          paramView = paramView.toString();
        }
      }
      paramView = h.b(localContext, paramView, paramViewGroup.mvG.getNickNameSize());
    }
    catch (Exception paramView)
    {
      for (;;)
      {
        label316:
        label327:
        label338:
        label351:
        paramView = (View)localObject;
      }
    }
    localObject = paramView;
    if (paramView == null) {
      localObject = "";
    }
    paramViewGroup.mvG.setName((CharSequence)localObject);
    localx.vpn = ((CharSequence)localObject);
    for (;;)
    {
      paramViewGroup.mvG.updatePositionFlag();
      GMTrace.o(7299833790464L, 54388);
      return localView;
      paramViewGroup = (a)paramView.getTag();
      localView = paramView;
      break;
      paramViewGroup.mvG.setMaskBitmap(null);
      break label112;
      paramViewGroup.mvG.setMaskBitmap(null);
      break label112;
      paramViewGroup.mvG.setNickNameTextColor(mvB);
      break label131;
      paramViewGroup.mvG.setName(paramView);
    }
  }
  
  public final f pG(int paramInt)
  {
    GMTrace.i(7299699572736L, 54387);
    if (oR(paramInt))
    {
      localf = (f)aGE();
      GMTrace.o(7299699572736L, 54387);
      return localf;
    }
    if (this.vKt != null)
    {
      localf = (f)this.vKt.get(Integer.valueOf(paramInt));
      if (localf != null)
      {
        GMTrace.o(7299699572736L, 54387);
        return localf;
      }
    }
    if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
    {
      GMTrace.o(7299699572736L, 54387);
      return null;
    }
    f localf = a(null, getCursor());
    if (this.vKt == null) {
      lb(true);
    }
    if (this.vKt != null) {
      this.vKt.put(Integer.valueOf(paramInt), localf);
    }
    GMTrace.o(7299699572736L, 54387);
    return localf;
  }
  
  protected static final class a
  {
    public AddressView mvG;
    
    public a(View paramView)
    {
      GMTrace.i(7299296919552L, 54384);
      this.mvG = ((AddressView)paramView.findViewById(R.h.bPn));
      GMTrace.o(7299296919552L, 54384);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\label\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */