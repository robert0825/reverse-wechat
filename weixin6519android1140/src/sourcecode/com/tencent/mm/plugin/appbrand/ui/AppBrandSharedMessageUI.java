package com.tencent.mm.plugin.appbrand.ui;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView;
import com.tencent.mm.ui.MMActivity;

public class AppBrandSharedMessageUI
  extends MMActivity
{
  private ListView Ev;
  private MRecyclerView hVr;
  
  public AppBrandSharedMessageUI()
  {
    GMTrace.i(10488310136832L, 78144);
    GMTrace.o(10488310136832L, 78144);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(10488444354560L, 78145);
    int i = o.g.hDg;
    GMTrace.o(10488444354560L, 78145);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10488578572288L, 78146);
    super.onCreate(paramBundle);
    this.Ev = ((ListView)findViewById(o.f.hBS));
    this.hVr = ((MRecyclerView)findViewById(o.f.hBN));
    this.Ev.setAdapter(new b(getLayoutInflater()));
    this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(10498376466432L, 78219);
        GMTrace.o(10498376466432L, 78219);
      }
    });
    this.hVr.a(new LinearLayoutManager(1, false));
    this.hVr.a(new a());
    this.hVr.addHeaderView(getLayoutInflater().inflate(o.g.hDf, null));
    GMTrace.o(10488578572288L, 78146);
  }
  
  public static final class a
    extends RecyclerView.a
  {
    public a()
    {
      GMTrace.i(10510992932864L, 78313);
      GMTrace.o(10510992932864L, 78313);
    }
    
    public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
    {
      GMTrace.i(10511127150592L, 78314);
      GMTrace.o(10511127150592L, 78314);
      return null;
    }
    
    public final void a(RecyclerView.t paramt, int paramInt)
    {
      GMTrace.i(10511261368320L, 78315);
      GMTrace.o(10511261368320L, 78315);
    }
    
    public final int getItemCount()
    {
      GMTrace.i(10511395586048L, 78316);
      GMTrace.o(10511395586048L, 78316);
      return 0;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(10511529803776L, 78317);
      paramInt = super.getItemViewType(paramInt);
      GMTrace.o(10511529803776L, 78317);
      return paramInt;
    }
  }
  
  private static final class b
    extends BaseAdapter
  {
    private LayoutInflater CJ;
    
    public b(LayoutInflater paramLayoutInflater)
    {
      GMTrace.i(10551526686720L, 78615);
      this.CJ = paramLayoutInflater;
      GMTrace.o(10551526686720L, 78615);
    }
    
    public final int getCount()
    {
      GMTrace.i(10551660904448L, 78616);
      GMTrace.o(10551660904448L, 78616);
      return 0;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(10551795122176L, 78617);
      GMTrace.o(10551795122176L, 78617);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(10551929339904L, 78618);
      GMTrace.o(10551929339904L, 78618);
      return 0L;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(10552063557632L, 78619);
      paramInt = super.getItemViewType(paramInt);
      GMTrace.o(10552063557632L, 78619);
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(10552331993088L, 78621);
      GMTrace.o(10552331993088L, 78621);
      return null;
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(10552197775360L, 78620);
      GMTrace.o(10552197775360L, 78620);
      return 4;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\appbrand\ui\AppBrandSharedMessageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */