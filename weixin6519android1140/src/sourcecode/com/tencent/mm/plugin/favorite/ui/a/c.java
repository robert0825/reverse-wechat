package com.tencent.mm.plugin.favorite.ui.a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.favorite.b.t;
import com.tencent.mm.plugin.favorite.b.t.a;
import com.tencent.mm.plugin.favorite.h;
import com.tencent.mm.plugin.favorite.ui.base.FavTagPanel;
import com.tencent.mm.protocal.c.ua;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.MMTagPanel.a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public abstract class c
  extends BaseAdapter
  implements t.a, MMTagPanel.a
{
  private Context context;
  private int lgi;
  private int lgj;
  private Set<String> lgk;
  
  public c(Context paramContext)
  {
    GMTrace.i(6325815738368L, 47131);
    this.lgi = R.e.aOE;
    this.lgj = R.g.baL;
    this.lgk = new HashSet();
    this.context = paramContext;
    GMTrace.o(6325815738368L, 47131);
  }
  
  public final void aB(List<String> paramList)
  {
    GMTrace.i(6327157915648L, 47141);
    this.lgk.clear();
    if (paramList != null) {
      this.lgk.addAll(paramList);
    }
    GMTrace.o(6327157915648L, 47141);
  }
  
  public final void atg()
  {
    GMTrace.i(6326755262464L, 47138);
    GMTrace.o(6326755262464L, 47138);
  }
  
  public final void axS()
  {
    GMTrace.i(6327829004288L, 47146);
    w.d("MicroMsg.FavoriteTagPanelAdapter", "on addtag callback");
    notifyDataSetChanged();
    GMTrace.o(6327829004288L, 47146);
  }
  
  public final void axT()
  {
    GMTrace.i(6327963222016L, 47147);
    w.d("MicroMsg.FavoriteTagPanelAdapter", "on removetag callback");
    notifyDataSetChanged();
    GMTrace.o(6327963222016L, 47147);
  }
  
  public int getCount()
  {
    GMTrace.i(6325949956096L, 47132);
    h.axu();
    GMTrace.o(6325949956096L, 47132);
    return 1;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(6326084173824L, 47133);
    long l = paramInt;
    GMTrace.o(6326084173824L, 47133);
    return l;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(6326218391552L, 47134);
    Set localSet;
    Object localObject;
    boolean bool;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.cwK, null);
      paramViewGroup = new a();
      paramViewGroup.jtq = ((TextView)paramView.findViewById(R.h.bzj));
      paramViewGroup.lgl = ((FavTagPanel)paramView.findViewById(R.h.bzt));
      paramViewGroup.lgl.wfk = this;
      paramViewGroup.lgl.lgj = this.lgj;
      paramViewGroup.lgl.lgi = this.lgi;
      paramView.setTag(paramViewGroup);
      paramViewGroup = paramViewGroup.lgl;
      localSet = this.lgk;
      localObject = h.axu().nA(paramInt);
      if ((localObject != null) && (!((List)localObject).isEmpty())) {
        break label184;
      }
      if (localObject != null) {
        break label178;
      }
      bool = true;
      label138:
      w.e("MicroMsg.FavTagPanel", "setTagListByTagInfo,null == tags ?%B,", new Object[] { Boolean.valueOf(bool) });
    }
    for (;;)
    {
      GMTrace.o(6326218391552L, 47134);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label178:
      bool = false;
      break label138;
      label184:
      w.i("MicroMsg.FavTagPanel", "setTagListByTagInfo,tags.size = %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
      LinkedList localLinkedList = new LinkedList();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        localLinkedList.add(((ua)((Iterator)localObject).next()).rOy);
      }
      paramViewGroup.a(localSet, localLinkedList);
    }
  }
  
  public final void j(boolean paramBoolean, int paramInt)
  {
    GMTrace.i(6328097439744L, 47148);
    GMTrace.o(6328097439744L, 47148);
  }
  
  public final void wv(String paramString)
  {
    GMTrace.i(6327694786560L, 47145);
    yd(paramString);
    yb(paramString);
    GMTrace.o(6327694786560L, 47145);
  }
  
  public final void ww(String paramString)
  {
    GMTrace.i(6327560568832L, 47144);
    yc(paramString);
    ya(paramString);
    GMTrace.o(6327560568832L, 47144);
  }
  
  public final void wx(String paramString)
  {
    GMTrace.i(6326352609280L, 47135);
    GMTrace.o(6326352609280L, 47135);
  }
  
  public final void wy(String paramString)
  {
    GMTrace.i(6326486827008L, 47136);
    GMTrace.o(6326486827008L, 47136);
  }
  
  public final void wz(String paramString)
  {
    GMTrace.i(6326621044736L, 47137);
    GMTrace.o(6326621044736L, 47137);
  }
  
  public abstract void ya(String paramString);
  
  public abstract void yb(String paramString);
  
  public final void yc(String paramString)
  {
    GMTrace.i(6326889480192L, 47139);
    this.lgk.add(paramString);
    notifyDataSetChanged();
    GMTrace.o(6326889480192L, 47139);
  }
  
  public final void yd(String paramString)
  {
    GMTrace.i(6327023697920L, 47140);
    this.lgk.remove(paramString);
    notifyDataSetChanged();
    GMTrace.o(6327023697920L, 47140);
  }
  
  public static final class a
  {
    TextView jtq;
    FavTagPanel lgl;
    
    public a()
    {
      GMTrace.i(6328768528384L, 47153);
      GMTrace.o(6328768528384L, 47153);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */