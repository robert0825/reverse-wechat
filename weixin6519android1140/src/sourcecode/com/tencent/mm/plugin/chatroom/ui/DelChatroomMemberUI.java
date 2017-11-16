package com.tencent.mm.plugin.chatroom.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.af;
import com.tencent.mm.h.a;
import com.tencent.mm.plugin.chatroom.d.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DelChatroomMemberUI
  extends MMActivity
  implements e
{
  private ListView Ev;
  private String chatroomName;
  private r hsU;
  private q jNF;
  private LinkedList<String> jOA;
  private a jOz;
  private int scene;
  
  public DelChatroomMemberUI()
  {
    GMTrace.i(9079023992832L, 67644);
    this.jOA = new LinkedList();
    GMTrace.o(9079023992832L, 67644);
  }
  
  protected final void MP()
  {
    GMTrace.i(9079560863744L, 67648);
    oM(R.l.dSS);
    this.Ev = ((ListView)findViewById(R.h.bMQ));
    this.jOz = new a();
    a locala = this.jOz;
    Object localObject = this.jOA;
    if (localObject != null)
    {
      w.i("MicroMsg.DelChatroomMemberAdapter", "initData members.size %d", new Object[] { Integer.valueOf(((List)localObject).size()) });
      locala.jOC.clear();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        at.AR();
        x localx = c.yK().TE(str);
        if ((localx != null) && (!bg.nm(localx.field_username)) && (localx.field_username.equals(str))) {
          locala.jOC.add(localx);
        }
      }
    }
    this.Ev.setAdapter(this.jOz);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9112712642560L, 67895);
        DelChatroomMemberUI.this.finish();
        GMTrace.o(9112712642560L, 67895);
        return true;
      }
    });
    GMTrace.o(9079560863744L, 67648);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9079829299200L, 67650);
    w.i("MicroMsg.DelChatroomMemberUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.hsU != null) {
      this.hsU.dismiss();
    }
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      if (paramInt2 == 63512)
      {
        paramString = a.dH(paramString);
        if (paramString != null)
        {
          paramString.a(this, null, null);
          GMTrace.o(9079829299200L, 67650);
          return;
        }
        com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dSN), null, getString(R.l.dSO), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(9156064968704L, 68218);
            GMTrace.o(9156064968704L, 68218);
          }
        });
        GMTrace.o(9079829299200L, 67650);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dSW), null, getString(R.l.cTM), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(9077413380096L, 67632);
          GMTrace.o(9077413380096L, 67632);
        }
      });
      GMTrace.o(9079829299200L, 67650);
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.ui.base.h.bm(this, getString(R.l.dSQ));
      this.jOz.ai(((g)paramk).eNC);
      this.Ev.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(9115262779392L, 67914);
          if (DelChatroomMemberUI.a(DelChatroomMemberUI.this).getCount() == 0) {
            DelChatroomMemberUI.this.finish();
          }
          GMTrace.o(9115262779392L, 67914);
        }
      });
    }
    GMTrace.o(9079829299200L, 67650);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9079695081472L, 67649);
    int i = R.i.crN;
    GMTrace.o(9079695081472L, 67649);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    int i = 0;
    GMTrace.i(9079158210560L, 67645);
    super.onCreate(paramBundle);
    at.wS().a(179, this);
    this.chatroomName = getIntent().getStringExtra("RoomInfo_Id");
    this.scene = getIntent().getIntExtra("scene", 0);
    paramBundle = getIntent().getStringExtra("members").split(",");
    int j = paramBundle.length;
    while (i < j)
    {
      Object localObject = paramBundle[i];
      this.jOA.add(localObject);
      i += 1;
    }
    at.AR();
    this.jNF = c.yT().gC(this.chatroomName);
    MP();
    GMTrace.o(9079158210560L, 67645);
  }
  
  public void onDestroy()
  {
    GMTrace.i(9079292428288L, 67646);
    at.wS().b(179, this);
    super.onDestroy();
    GMTrace.o(9079292428288L, 67646);
  }
  
  public void onResume()
  {
    GMTrace.i(9079426646016L, 67647);
    super.onResume();
    GMTrace.o(9079426646016L, 67647);
  }
  
  final class a
    extends BaseAdapter
  {
    List<x> jOC;
    
    a()
    {
      GMTrace.i(9107612368896L, 67857);
      this.jOC = new LinkedList();
      GMTrace.o(9107612368896L, 67857);
    }
    
    public final void ai(List<String> paramList)
    {
      GMTrace.i(9107746586624L, 67858);
      Iterator localIterator1 = paramList.iterator();
      int i = 0;
      if (localIterator1.hasNext())
      {
        String str = (String)localIterator1.next();
        Iterator localIterator2 = this.jOC.iterator();
        do
        {
          if (!localIterator2.hasNext()) {
            break;
          }
          paramList = (x)localIterator2.next();
        } while (!paramList.field_username.equals(str));
      }
      for (;;)
      {
        if (paramList != null)
        {
          i = 1;
          this.jOC.remove(paramList);
        }
        for (;;)
        {
          break;
          if (i != 0) {
            notifyDataSetChanged();
          }
          GMTrace.o(9107746586624L, 67858);
          return;
        }
        paramList = null;
      }
    }
    
    public final String c(x paramx)
    {
      GMTrace.i(9108417675264L, 67863);
      if (!bg.nm(paramx.field_conRemark)) {}
      for (Object localObject2 = paramx.field_conRemark;; localObject2 = DelChatroomMemberUI.b(DelChatroomMemberUI.this, paramx.field_username))
      {
        Object localObject1 = localObject2;
        if (bg.nm((String)localObject2)) {
          localObject1 = paramx.field_conRemark;
        }
        localObject2 = localObject1;
        if (bg.nm((String)localObject1)) {
          localObject2 = paramx.vj();
        }
        GMTrace.o(9108417675264L, 67863);
        return (String)localObject2;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(9107880804352L, 67859);
      int i = this.jOC.size();
      GMTrace.o(9107880804352L, 67859);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(9108015022080L, 67860);
      Object localObject = this.jOC.get(paramInt);
      GMTrace.o(9108015022080L, 67860);
      return localObject;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9108149239808L, 67861);
      GMTrace.o(9108149239808L, 67861);
      return 0L;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9108283457536L, 67862);
      if (paramView == null)
      {
        paramView = View.inflate(DelChatroomMemberUI.this, R.i.crM, null);
        paramViewGroup = new DelChatroomMemberUI.b(DelChatroomMemberUI.this);
        paramViewGroup.hqG = ((ImageView)paramView.findViewById(R.h.bmf));
        paramViewGroup.jpV = ((TextView)paramView.findViewById(R.h.bmg));
        paramViewGroup.jOG = ((TextView)paramView.findViewById(R.h.bme));
        paramViewGroup.jOG.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(final View paramAnonymousView)
          {
            GMTrace.i(9078889775104L, 67643);
            int i = ((Integer)paramAnonymousView.getTag()).intValue();
            paramAnonymousView = (x)DelChatroomMemberUI.a.this.getItem(i);
            String str = DelChatroomMemberUI.this.getString(R.l.dSI, new Object[] { DelChatroomMemberUI.a.this.c(paramAnonymousView) });
            com.tencent.mm.ui.base.h.a(DelChatroomMemberUI.this, str, null, DelChatroomMemberUI.this.getString(R.l.dSP), DelChatroomMemberUI.this.getString(R.l.cSk), true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(9107478151168L, 67856);
                DelChatroomMemberUI.a(DelChatroomMemberUI.this, paramAnonymousView.field_username);
                GMTrace.o(9107478151168L, 67856);
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(9114994343936L, 67912);
                GMTrace.o(9114994343936L, 67912);
              }
            });
            GMTrace.o(9078889775104L, 67643);
          }
        });
        paramView.setTag(paramViewGroup);
      }
      for (;;)
      {
        paramViewGroup.jOG.setTag(Integer.valueOf(paramInt));
        x localx = (x)getItem(paramInt);
        String str = c(localx);
        paramViewGroup.jpV.setText(str);
        com.tencent.mm.pluginsdk.ui.d.h.b(DelChatroomMemberUI.this, str, paramViewGroup.jpV.getTextSize());
        a.b.a(paramViewGroup.hqG, localx.field_username);
        GMTrace.o(9108283457536L, 67862);
        return paramView;
        paramViewGroup = (DelChatroomMemberUI.b)paramView.getTag();
      }
    }
  }
  
  final class b
  {
    public ImageView hqG;
    public TextView jOG;
    public TextView jpV;
    
    b()
    {
      GMTrace.i(9118349787136L, 67937);
      GMTrace.o(9118349787136L, 67937);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\DelChatroomMemberUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */