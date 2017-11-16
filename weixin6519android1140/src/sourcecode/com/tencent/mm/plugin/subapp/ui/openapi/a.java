package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class a
  extends BaseAdapter
  implements j.a
{
  private Context context;
  boolean qtv;
  private int qtw;
  private List<f> qtx;
  
  public a(Context paramContext, int paramInt)
  {
    GMTrace.i(5806527348736L, 43262);
    this.qtv = false;
    this.qtw = 0;
    this.context = paramContext;
    this.qtw = paramInt;
    init();
    GMTrace.o(5806527348736L, 43262);
  }
  
  private int aGD()
  {
    GMTrace.i(5807735308288L, 43271);
    int i = asx();
    GMTrace.o(5807735308288L, 43271);
    return (4 - i % 4) % 4;
  }
  
  private int asx()
  {
    GMTrace.i(5807601090560L, 43270);
    int i = this.qtx.size();
    GMTrace.o(5807601090560L, 43270);
    return i;
  }
  
  private void init()
  {
    int i = 0;
    GMTrace.i(5806661566464L, 43263);
    this.qtx = new ArrayList();
    Object localObject1 = an.aWy();
    int j = this.qtw;
    Object localObject2 = ((i)localObject1).rawQuery("select * from AppInfo where status = " + j + " and (appType is null or appType not like ',1,')", new String[0]);
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      w.e("MicroMsg.AppInfoStorage", "getAppByStatusExcludeByType: curosr is null");
      localObject1 = null;
    }
    if (localObject1 != null)
    {
      j = ((Cursor)localObject1).getCount();
      while (i < j)
      {
        ((Cursor)localObject1).moveToPosition(i);
        localObject2 = new f();
        ((f)localObject2).b((Cursor)localObject1);
        if (g.n(this.context, ((f)localObject2).field_appId)) {
          this.qtx.add(localObject2);
        }
        i += 1;
      }
      ((Cursor)localObject1).close();
    }
    GMTrace.o(5806661566464L, 43263);
  }
  
  public final void a(String paramString, l paraml)
  {
    GMTrace.i(5807869526016L, 43272);
    init();
    super.notifyDataSetChanged();
    GMTrace.o(5807869526016L, 43272);
  }
  
  public final int getCount()
  {
    GMTrace.i(5807064219648L, 43266);
    int i = asx();
    int j = aGD();
    GMTrace.o(5807064219648L, 43266);
    return i + j;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(5807332655104L, 43268);
    if (oR(paramInt))
    {
      GMTrace.o(5807332655104L, 43268);
      return null;
    }
    Object localObject = this.qtx.get(paramInt);
    GMTrace.o(5807332655104L, 43268);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(5807466872832L, 43269);
    long l = paramInt;
    GMTrace.o(5807466872832L, 43269);
    return l;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(5806930001920L, 43265);
    if (paramView == null)
    {
      paramViewGroup = new d();
      paramView = View.inflate(this.context, R.i.cpk, null);
      paramViewGroup.iDp = ((ImageView)paramView.findViewById(R.h.beB));
      paramViewGroup.qtS = ((TextView)paramView.findViewById(R.h.beA));
      paramViewGroup.hvQ = ((TextView)paramView.findViewById(R.h.beC));
      paramViewGroup.qtT = paramView.findViewById(R.h.beD);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      paramViewGroup.qtT.setVisibility(4);
      if (!oR(paramInt)) {
        break;
      }
      paramViewGroup.iDp.setVisibility(4);
      paramViewGroup.qtS.setVisibility(4);
      paramViewGroup.hvQ.setVisibility(4);
      GMTrace.o(5806930001920L, 43265);
      return paramView;
      paramViewGroup = (d)paramView.getTag();
    }
    f localf = (f)getItem(paramInt);
    paramViewGroup.iDp.setVisibility(0);
    Bitmap localBitmap = g.b(localf.field_appId, 1, com.tencent.mm.br.a.getDensity(this.context));
    if (localBitmap == null)
    {
      paramViewGroup.iDp.setBackgroundResource(R.g.aTM);
      paramViewGroup.hvQ.setVisibility(0);
      paramViewGroup.hvQ.setText(g.a(this.context, localf, null));
      if (!this.qtv) {
        break label271;
      }
      paramViewGroup.qtS.setVisibility(0);
    }
    for (;;)
    {
      GMTrace.o(5806930001920L, 43265);
      return paramView;
      paramViewGroup.iDp.setBackgroundDrawable(new BitmapDrawable(localBitmap));
      break;
      label271:
      paramViewGroup.qtS.setVisibility(8);
    }
  }
  
  public final void ij(boolean paramBoolean)
  {
    GMTrace.i(5806795784192L, 43264);
    this.qtv = paramBoolean;
    notifyDataSetChanged();
    GMTrace.o(5806795784192L, 43264);
  }
  
  public final boolean oR(int paramInt)
  {
    GMTrace.i(5807198437376L, 43267);
    int i = this.qtx.size();
    if ((paramInt >= i) && (paramInt < i + aGD()))
    {
      GMTrace.o(5807198437376L, 43267);
      return true;
    }
    GMTrace.o(5807198437376L, 43267);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\openapi\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */