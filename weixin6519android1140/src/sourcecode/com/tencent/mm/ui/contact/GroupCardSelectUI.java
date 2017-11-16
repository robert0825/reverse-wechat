package com.tencent.mm.ui.contact;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.m;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GroupCardSelectUI
  extends MMActivity
{
  private TextView jqc;
  private List<x> mTu;
  private boolean wSi;
  private boolean wSj;
  private boolean wSk;
  private List<String> wSl;
  private int wSm;
  private ListView wSn;
  private a wSo;
  private HashMap<String, Long> wSp;
  
  public GroupCardSelectUI()
  {
    GMTrace.i(1753017745408L, 13061);
    this.wSi = true;
    this.wSk = false;
    this.wSl = null;
    GMTrace.o(1753017745408L, 13061);
  }
  
  private void Qe()
  {
    GMTrace.i(1754225704960L, 13070);
    StringBuilder localStringBuilder;
    if (this.wSk)
    {
      localStringBuilder = new StringBuilder().append(getString(R.l.cTM));
      if (this.wSl.size() <= 0) {
        break label94;
      }
    }
    label94:
    for (String str = String.format("(%s)", new Object[] { Integer.valueOf(this.wSl.size()) });; str = "")
    {
      aH(1, str);
      GMTrace.o(1754225704960L, 13070);
      return;
    }
  }
  
  private void a(int paramInt, x paramx, long paramLong)
  {
    GMTrace.i(1753957269504L, 13068);
    int i = 0;
    while ((i < paramInt) && (paramLong <= ((Long)this.wSp.get(((x)this.mTu.get(i)).field_username)).longValue())) {
      i += 1;
    }
    this.mTu.add(i, paramx);
    GMTrace.o(1753957269504L, 13068);
  }
  
  private void cgw()
  {
    GMTrace.i(1753823051776L, 13067);
    at.AR();
    this.wSp = c.yP().bSZ();
    this.mTu = new LinkedList();
    List localList = s.Ao();
    if (localList.size() == 0)
    {
      GMTrace.o(1753823051776L, 13067);
      return;
    }
    Iterator localIterator = localList.iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      if (!this.wSp.containsKey(localx.field_username))
      {
        if (!com.tencent.mm.l.a.eE(localx.field_type)) {
          break label177;
        }
        this.mTu.add(localx);
      }
      else
      {
        a(i, localx, ((Long)this.wSp.get(localx.field_username)).longValue());
        i += 1;
      }
    }
    label177:
    for (;;)
    {
      break;
      localList.clear();
      GMTrace.o(1753823051776L, 13067);
      return;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(1753688834048L, 13066);
    this.wSn = ((ListView)findViewById(R.h.bFJ));
    this.wSo = new a();
    this.wSn.setAdapter(this.wSo);
    this.wSn.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1806167965696L, 13457);
        paramAnonymousAdapterView = (x)GroupCardSelectUI.a(GroupCardSelectUI.this).getItem(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          w.v("MicroMsg.GroupCardSelectUI", "onItemClick contact null");
          GMTrace.o(1806167965696L, 13457);
          return;
        }
        GroupCardSelectUI.a(GroupCardSelectUI.this, paramAnonymousAdapterView);
        GroupCardSelectUI.b(GroupCardSelectUI.this);
        GMTrace.o(1806167965696L, 13457);
      }
    });
    this.jqc = ((TextView)findViewById(R.h.bFF));
    if (this.wSo.getCount() <= 0) {
      this.jqc.setVisibility(0);
    }
    for (;;)
    {
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(1836366954496L, 13682);
          GroupCardSelectUI.this.finish();
          GMTrace.o(1836366954496L, 13682);
          return true;
        }
      });
      GMTrace.o(1753688834048L, 13066);
      return;
      this.jqc.setVisibility(8);
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1754091487232L, 13069);
    int i = R.i.czG;
    GMTrace.o(1754091487232L, 13069);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1753151963136L, 13062);
    super.onCreate(paramBundle);
    sq(getString(R.l.cRi));
    this.wSi = getIntent().getBooleanExtra("group_select_type", true);
    this.wSj = getIntent().getBooleanExtra("group_select_need_result", false);
    this.wSk = getIntent().getBooleanExtra("group_multi_select", false);
    if (this.wSk)
    {
      paramBundle = getIntent().getStringExtra("already_select_contact");
      if (!bg.nm(paramBundle)) {
        break label179;
      }
    }
    label179:
    for (this.wSl = new LinkedList();; this.wSl = t.g(paramBundle.split(",")))
    {
      this.wSm = getIntent().getIntExtra("max_limit_num", 0);
      cgw();
      MP();
      if (this.wSk)
      {
        a(1, getString(R.l.cTM), new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(1786303741952L, 13309);
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.putExtra("Select_Conv_User", bg.c(GroupCardSelectUI.e(GroupCardSelectUI.this), ","));
            GroupCardSelectUI.this.setResult(-1, paramAnonymousMenuItem);
            GroupCardSelectUI.this.finish();
            GMTrace.o(1786303741952L, 13309);
            return true;
          }
        }, p.b.vLG);
        Y(1, true);
        Qe();
      }
      GMTrace.o(1753151963136L, 13062);
      return;
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1753286180864L, 13063);
    super.onDestroy();
    GMTrace.o(1753286180864L, 13063);
  }
  
  protected void onPause()
  {
    GMTrace.i(1753554616320L, 13065);
    super.onPause();
    GMTrace.o(1753554616320L, 13065);
  }
  
  protected void onResume()
  {
    GMTrace.i(1753420398592L, 13064);
    super.onResume();
    GMTrace.o(1753420398592L, 13064);
  }
  
  final class a
    extends BaseAdapter
  {
    public a()
    {
      GMTrace.i(1782411427840L, 13280);
      GMTrace.o(1782411427840L, 13280);
    }
    
    public final int getCount()
    {
      GMTrace.i(1782679863296L, 13282);
      int i = GroupCardSelectUI.c(GroupCardSelectUI.this).size();
      GMTrace.o(1782679863296L, 13282);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1782814081024L, 13283);
      Object localObject = GroupCardSelectUI.c(GroupCardSelectUI.this).get(paramInt);
      GMTrace.o(1782814081024L, 13283);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1782948298752L, 13284);
      GMTrace.o(1782948298752L, 13284);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1782545645568L, 13281);
      x localx = (x)GroupCardSelectUI.c(GroupCardSelectUI.this).get(paramInt);
      View localView;
      if (paramView == null)
      {
        paramView = new GroupCardSelectUI.b(GroupCardSelectUI.this);
        localView = View.inflate(GroupCardSelectUI.this, R.i.czH, null);
        paramView.mwp = ((TextView)localView.findViewById(R.h.bFH));
        paramView.wSr = ((TextView)localView.findViewById(R.h.bFI));
        paramView.gDc = ((ImageView)localView.findViewById(R.h.bFG));
        paramView.nJu = ((CheckBox)localView.findViewById(R.h.cbs));
        localView.setTag(paramView);
        paramViewGroup = paramView;
        a.b.a(paramViewGroup.gDc, localx.field_username);
        paramViewGroup.wSr.setText(h.c(GroupCardSelectUI.this, r.fs(localx.field_username), com.tencent.mm.br.a.V(GroupCardSelectUI.this.vKB.vKW, R.f.aQF)));
        paramViewGroup.mwp.setText("(" + m.fk(localx.field_username) + ")");
        if (GroupCardSelectUI.d(GroupCardSelectUI.this))
        {
          paramViewGroup.nJu.setVisibility(0);
          if (!GroupCardSelectUI.e(GroupCardSelectUI.this).contains(localx.field_username)) {
            break label281;
          }
          paramViewGroup.nJu.setChecked(true);
        }
      }
      for (;;)
      {
        GMTrace.o(1782545645568L, 13281);
        return localView;
        paramViewGroup = (GroupCardSelectUI.b)paramView.getTag();
        localView = paramView;
        break;
        label281:
        paramViewGroup.nJu.setChecked(false);
      }
    }
  }
  
  final class b
  {
    ImageView gDc;
    TextView mwp;
    CheckBox nJu;
    TextView wSr;
    
    b()
    {
      GMTrace.i(1738656448512L, 12954);
      GMTrace.o(1738656448512L, 12954);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\contact\GroupCardSelectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */