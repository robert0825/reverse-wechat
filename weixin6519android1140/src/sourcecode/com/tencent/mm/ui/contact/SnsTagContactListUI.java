package com.tencent.mm.ui.contact;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.sns.b.k;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class SnsTagContactListUI
  extends MMActivity
{
  private ListView mvH;
  private a wUy;
  private List<Long> wUz;
  
  public SnsTagContactListUI()
  {
    GMTrace.i(1834890559488L, 13671);
    this.wUz = new ArrayList();
    GMTrace.o(1834890559488L, 13671);
  }
  
  protected final void MP()
  {
    GMTrace.i(1835158994944L, 13673);
    oM(R.l.edq);
    findViewById(R.h.bKK).setVisibility(8);
    this.mvH = ((ListView)findViewById(R.h.bcT));
    long[] arrayOfLong = getIntent().getLongArrayExtra("sns_tag_list");
    if (arrayOfLong == null)
    {
      finish();
      GMTrace.o(1835158994944L, 13673);
      return;
    }
    int i = 0;
    while (i < arrayOfLong.length)
    {
      this.wUz.add(Long.valueOf(arrayOfLong[i]));
      i += 1;
    }
    ((TextView)findViewById(R.h.bwx)).setVisibility(8);
    findViewById(R.h.bdc).setVisibility(8);
    this.mvH.setBackgroundColor(getResources().getColor(R.e.white));
    ((View)this.mvH.getParent()).setBackgroundColor(getResources().getColor(R.e.white));
    this.wUy = new a(this, this.wUz);
    this.mvH.setAdapter(this.wUy);
    this.mvH.setVisibility(0);
    this.mvH.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(1730200731648L, 12891);
        paramAnonymousAdapterView = new Intent();
        paramAnonymousView = (a)SnsTagContactListUI.a(SnsTagContactListUI.this).getItem(paramAnonymousInt);
        com.tencent.mm.plugin.sns.b.h localh = n.poT;
        if (localh == null)
        {
          SnsTagContactListUI.this.finish();
          GMTrace.o(1730200731648L, 12891);
          return;
        }
        paramAnonymousAdapterView = localh.f(paramAnonymousAdapterView, paramAnonymousView.field_username);
        if (paramAnonymousAdapterView == null)
        {
          SnsTagContactListUI.this.finish();
          GMTrace.o(1730200731648L, 12891);
          return;
        }
        d.b(SnsTagContactListUI.this.vKB.vKW, "sns", ".ui.SnsUserUI", paramAnonymousAdapterView);
        GMTrace.o(1730200731648L, 12891);
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(1804557352960L, 13445);
        SnsTagContactListUI.this.finish();
        GMTrace.o(1804557352960L, 13445);
        return true;
      }
    });
    lg(false);
    GMTrace.o(1835158994944L, 13673);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(1835561648128L, 13676);
    int i = R.i.coT;
    GMTrace.o(1835561648128L, 13676);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(1835024777216L, 13672);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(1835024777216L, 13672);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(1835427430400L, 13675);
    super.onDestroy();
    GMTrace.o(1835427430400L, 13675);
  }
  
  public void onResume()
  {
    GMTrace.i(1835293212672L, 13674);
    super.onResume();
    if (this.wUy != null) {
      this.wUy.notifyDataSetChanged();
    }
    GMTrace.o(1835293212672L, 13674);
  }
  
  private static final class a
    extends BaseAdapter
  {
    private Context context;
    private ar pYO;
    private Map<Integer, String> wUB;
    private Map<Integer, a> wUt;
    private ColorStateList wUu;
    private ColorStateList wUv;
    
    public a(Context paramContext, List<Long> paramList)
    {
      GMTrace.i(1839722397696L, 13707);
      this.context = null;
      this.wUt = new HashMap();
      this.wUB = new HashMap();
      this.pYO = null;
      this.context = paramContext;
      this.wUt.clear();
      this.wUB.clear();
      at.AR();
      this.pYO = c.yK();
      paramList = paramList.iterator();
      Object localObject;
      int j;
      for (int i = 0; paramList.hasNext(); i = j)
      {
        long l = ((Long)paramList.next()).longValue();
        localObject = n.poR;
        j = i;
        if (localObject != null)
        {
          Iterator localIterator = ((k)localObject).dr(l).iterator();
          for (;;)
          {
            j = i;
            if (!localIterator.hasNext()) {
              break;
            }
            String str = (String)localIterator.next();
            a locala = new a();
            locala.setUsername(str);
            this.wUB.put(Integer.valueOf(this.wUt.size()), ((k)localObject).ds(l));
            this.wUt.put(Integer.valueOf(i), locala);
            i += 1;
          }
        }
      }
      try
      {
        paramList = paramContext.getResources().getXml(R.e.aOq);
        localObject = paramContext.getResources().getXml(R.e.aOr);
        this.wUu = ColorStateList.createFromXml(paramContext.getResources(), paramList);
        this.wUv = ColorStateList.createFromXml(paramContext.getResources(), (XmlPullParser)localObject);
        GMTrace.o(1839722397696L, 13707);
        return;
      }
      catch (XmlPullParserException paramContext)
      {
        w.printErrStackTrace("MicroMsg.SnsTagContactList", paramContext, "", new Object[0]);
        GMTrace.o(1839722397696L, 13707);
        return;
      }
      catch (IOException paramContext)
      {
        w.printErrStackTrace("MicroMsg.SnsTagContactList", paramContext, "", new Object[0]);
        GMTrace.o(1839722397696L, 13707);
      }
    }
    
    private String DF(int paramInt)
    {
      GMTrace.i(1840393486336L, 13712);
      if (!this.wUB.containsKey(Integer.valueOf(paramInt)))
      {
        GMTrace.o(1840393486336L, 13712);
        return "";
      }
      String str = (String)this.wUB.get(Integer.valueOf(paramInt));
      GMTrace.o(1840393486336L, 13712);
      return str;
    }
    
    public final int getCount()
    {
      GMTrace.i(1839856615424L, 13708);
      int i = this.wUt.size();
      GMTrace.o(1839856615424L, 13708);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(1839990833152L, 13709);
      if (paramInt < 0)
      {
        GMTrace.o(1839990833152L, 13709);
        return null;
      }
      a locala = (a)this.wUt.get(Integer.valueOf(paramInt));
      Object localObject = locala;
      if (locala.field_showHead == 0)
      {
        x localx = this.pYO.TE(locala.field_username);
        localObject = locala;
        if (localx != null)
        {
          this.wUt.put(Integer.valueOf(paramInt), localx);
          localObject = localx;
        }
      }
      GMTrace.o(1839990833152L, 13709);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(1840125050880L, 13710);
      GMTrace.o(1840125050880L, 13710);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(1840259268608L, 13711);
      label111:
      a locala;
      label156:
      TextView localTextView;
      if (paramView == null)
      {
        paramView = View.inflate(this.context, R.i.ctM, null);
        paramViewGroup = new SnsTagContactListUI.b();
        paramViewGroup.mpk = ((TextView)paramView.findViewById(R.h.brF));
        paramViewGroup.jRj = ((MaskLayout)paramView.findViewById(R.h.brD));
        paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.brH));
        paramViewGroup.wUx = ((TextView)paramView.findViewById(R.h.brB));
        paramView.setTag(paramViewGroup);
        if ((a)getItem(paramInt - 1) != null) {
          break label278;
        }
        localObject = "";
        locala = (a)getItem(paramInt);
        if (paramInt != 0) {
          break label290;
        }
        paramViewGroup.mpk.setVisibility(0);
        paramViewGroup.mpk.setText(DF(paramInt));
        paramViewGroup.mpk.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        localTextView = paramViewGroup.jtr;
        if (s.gm(locala.field_username)) {
          break label353;
        }
      }
      label278:
      label290:
      label353:
      for (Object localObject = this.wUu;; localObject = this.wUv)
      {
        localTextView.setTextColor((ColorStateList)localObject);
        a.b.b((ImageView)paramViewGroup.jRj.view, locala.field_username, true);
        paramViewGroup.wUx.setVisibility(8);
        paramViewGroup.jRj.setVisibility(0);
        paramViewGroup.jtr.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.context, locala.vk(), paramViewGroup.jtr.getTextSize()));
        paramViewGroup.jtr.setVisibility(0);
        GMTrace.o(1840259268608L, 13711);
        return paramView;
        paramViewGroup = (SnsTagContactListUI.b)paramView.getTag();
        break;
        localObject = DF(paramInt - 1);
        break label111;
        if ((paramInt > 0) && (!DF(paramInt).equals(localObject)))
        {
          paramViewGroup.mpk.setVisibility(0);
          paramViewGroup.mpk.setText(DF(paramInt));
          paramViewGroup.mpk.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
          break label156;
        }
        paramViewGroup.mpk.setVisibility(8);
        break label156;
      }
    }
  }
  
  private static final class b
  {
    MaskLayout jRj;
    TextView jtr;
    TextView mpk;
    TextView wUx;
    
    public b()
    {
      GMTrace.i(1763620945920L, 13140);
      GMTrace.o(1763620945920L, 13140);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\ui\contact\SnsTagContactListUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */