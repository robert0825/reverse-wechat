package com.tencent.mm.plugin.appbrand.jsapi.h;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.e;
import com.tencent.mm.plugin.appbrand.j;
import com.tencent.mm.plugin.appbrand.jsapi.d;
import com.tencent.mm.plugin.appbrand.n.c;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.page.AppBrandPageView;
import com.tencent.mm.plugin.appbrand.widget.input.m;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b
  extends com.tencent.mm.plugin.appbrand.jsapi.a
{
  private static final int CTRL_INDEX = 107;
  private static final String NAME = "showActionSheet";
  
  public b()
  {
    GMTrace.i(17680367091712L, 131729);
    GMTrace.o(17680367091712L, 131729);
  }
  
  public final void a(final j paramj, final JSONObject paramJSONObject, final int paramInt)
  {
    GMTrace.i(17680501309440L, 131730);
    final Object localObject1 = b(paramj);
    if (localObject1 == null)
    {
      w.w("MicroMsg.JsApiShowActionSheet", "invoke JsApi JsApiShowActionSheet failed, current page view is null.");
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(17680501309440L, 131730);
      return;
    }
    m.k((AppBrandPageView)localObject1);
    Object localObject2 = paramJSONObject.optString("itemList");
    localObject1 = new ArrayList();
    try
    {
      localObject2 = new JSONArray((String)localObject2);
      int i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        ((ArrayList)localObject1).add((String)((JSONArray)localObject2).get(i));
        i += 1;
      }
      af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(17678085390336L, 131712);
          if (!paramj.mRunning)
          {
            GMTrace.o(17678085390336L, 131712);
            return;
          }
          Object localObject = b.this.a(paramj);
          final com.tencent.mm.plugin.appbrand.widget.c.a locala = new com.tencent.mm.plugin.appbrand.widget.c.a((Context)localObject);
          int i = c.az(paramJSONObject.optString("itemColor", ""), Color.parseColor("#000000"));
          localObject = (ViewGroup)View.inflate((Context)localObject, o.g.gfl, null);
          locala.setContentView((View)localObject);
          localObject = (ListView)((ViewGroup)localObject).findViewById(o.f.list);
          ((ListView)localObject).setAdapter(new b.a(localObject1, i));
          ((ListView)localObject).setOnItemClickListener(new AdapterView.OnItemClickListener()
          {
            public final void onItemClick(AdapterView<?> paramAnonymous2AdapterView, View paramAnonymous2View, int paramAnonymous2Int, long paramAnonymous2Long)
            {
              GMTrace.i(17682648793088L, 131746);
              paramAnonymous2AdapterView = new HashMap();
              paramAnonymous2AdapterView.put("tapIndex", Integer.valueOf(paramAnonymous2Int));
              b.1.this.hXV.v(b.1.this.fXx, b.this.d("ok", paramAnonymous2AdapterView));
              locala.dismiss();
              GMTrace.o(17682648793088L, 131746);
            }
          });
          locala.setOnCancelListener(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
            {
              GMTrace.i(17681306615808L, 131736);
              b.1.this.hXV.v(b.1.this.fXx, b.this.d("cancel", null));
              GMTrace.o(17681306615808L, 131736);
            }
          });
          paramj.hzM.a(locala);
          GMTrace.o(17678085390336L, 131712);
        }
      });
    }
    catch (Exception paramJSONObject)
    {
      w.e("MicroMsg.JsApiShowActionSheet", paramJSONObject.getMessage());
      paramj.v(paramInt, d("fail", null));
      GMTrace.o(17680501309440L, 131730);
      return;
    }
    GMTrace.o(17680501309440L, 131730);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private final ArrayList<String> ikk;
    private final int ikl;
    
    public a(ArrayList<String> paramArrayList, int paramInt)
    {
      GMTrace.i(18243142025216L, 135922);
      this.ikk = paramArrayList;
      this.ikl = paramInt;
      GMTrace.o(18243142025216L, 135922);
    }
    
    private String iH(int paramInt)
    {
      GMTrace.i(17679293349888L, 131721);
      String str = (String)this.ikk.get(paramInt);
      GMTrace.o(17679293349888L, 131721);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(17679159132160L, 131720);
      int i = this.ikk.size();
      GMTrace.o(17679159132160L, 131720);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(17679427567616L, 131722);
      long l = paramInt;
      GMTrace.o(17679427567616L, 131722);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(17679561785344L, 131723);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(paramViewGroup.getContext(), o.g.hDh, null);
        paramView = new a();
        paramView.ikm = ((TextView)localView.findViewById(o.f.title));
        localView.setTag(paramView);
        paramViewGroup = paramView;
      }
      for (;;)
      {
        paramViewGroup.ikm.setText(iH(paramInt));
        paramViewGroup.ikm.setTextColor(this.ikl);
        GMTrace.o(17679561785344L, 131723);
        return localView;
        paramViewGroup = (a)paramView.getTag();
        localView = paramView;
      }
    }
    
    private static final class a
    {
      TextView ikm;
      
      public a()
      {
        GMTrace.i(18242605154304L, 135918);
        GMTrace.o(18242605154304L, 135918);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */