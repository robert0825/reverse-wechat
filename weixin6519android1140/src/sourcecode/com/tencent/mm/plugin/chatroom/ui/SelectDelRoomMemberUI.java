package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Display;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.p.b;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SelectDelRoomMemberUI
  extends MMActivity
{
  private ListView Ev;
  private boolean eMr;
  public HashSet<String> hqM;
  private q jNF;
  private boolean jNm;
  private String jOR;
  private String jPg;
  private int jPh;
  private String jPi;
  private boolean jPj;
  private String jQJ;
  private String jQK;
  private String jQM;
  private int jRc;
  private a jRd;
  private EditText jRe;
  private String username;
  
  public SelectDelRoomMemberUI()
  {
    GMTrace.i(9153783267328L, 68201);
    GMTrace.o(9153783267328L, 68201);
  }
  
  private void Qe()
  {
    GMTrace.i(9154454355968L, 68206);
    if ((com.tencent.mm.ui.contact.s.ew(this.jRc, 64)) && (this.hqM.size() > 0))
    {
      aH(1, getString(R.l.dmF) + "(" + this.hqM.size() + ")");
      Y(1, true);
      GMTrace.o(9154454355968L, 68206);
      return;
    }
    aH(1, getString(R.l.dmF));
    Y(1, false);
    GMTrace.o(9154454355968L, 68206);
  }
  
  protected final void MP()
  {
    GMTrace.i(9154051702784L, 68203);
    super.MP();
    this.jOR = getIntent().getStringExtra("RoomInfo_Id");
    this.jQK = getIntent().getStringExtra("Chatroom_member_list");
    this.eMr = getIntent().getBooleanExtra("Is_Chatroom", true);
    this.jNm = getIntent().getBooleanExtra("Is_Lbsroom", false);
    this.jPj = getIntent().getBooleanExtra("Is_RoomOwner", false);
    this.jPi = getIntent().getStringExtra("room_owner_name");
    at.AR();
    this.jNF = c.yT().gC(this.jOR);
    this.jPh = getIntent().getIntExtra("room_member_count", 0);
    this.jRc = getIntent().getIntExtra("list_attr", com.tencent.mm.ui.contact.s.wTj);
    this.jPg = getIntent().getStringExtra("room_name");
    sq(getString(R.l.dTI) + "(" + this.jPh + ")");
    a(1, getString(R.l.dmF), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9108954546176L, 67867);
        com.tencent.mm.ui.base.h.a(SelectDelRoomMemberUI.this, SelectDelRoomMemberUI.this.getString(R.l.dSH), "", new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(9078621339648L, 67641);
            paramAnonymous2DialogInterface = new Intent();
            paramAnonymous2DialogInterface.putExtra("Select_Contact", bg.c(SelectDelRoomMemberUI.a(SelectDelRoomMemberUI.this), ","));
            SelectDelRoomMemberUI.this.setResult(-1, paramAnonymous2DialogInterface);
            SelectDelRoomMemberUI.this.finish();
            GMTrace.o(9078621339648L, 67641);
          }
        }, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(9110699376640L, 67880);
            GMTrace.o(9110699376640L, 67880);
          }
        });
        GMTrace.o(9108954546176L, 67867);
        return false;
      }
    }, p.b.vLH);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9088419233792L, 67714);
        SelectDelRoomMemberUI.this.finish();
        GMTrace.o(9088419233792L, 67714);
        return false;
      }
    });
    this.jRe = ((EditText)findViewById(R.h.bPh));
    this.jRe.addTextChangedListener(new TextWatcher()
    {
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9146132856832L, 68144);
        GMTrace.o(9146132856832L, 68144);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9145998639104L, 68143);
        GMTrace.o(9145998639104L, 68143);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9145864421376L, 68142);
        SelectDelRoomMemberUI.a locala = SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this);
        paramAnonymousCharSequence = paramAnonymousCharSequence.toString();
        locala.jQT = paramAnonymousCharSequence;
        ArrayList localArrayList = new ArrayList();
        if (!bg.nm(paramAnonymousCharSequence))
        {
          Iterator localIterator = SelectDelRoomMemberUI.a.jQW.iterator();
          while (localIterator.hasNext())
          {
            x localx = (x)localIterator.next();
            if (localx != null) {
              if ((localx.field_conRemark != null) && (localx.field_conRemark.toUpperCase().contains(paramAnonymousCharSequence.toUpperCase())))
              {
                localArrayList.add(localx);
              }
              else if ((!bg.nm(SelectDelRoomMemberUI.b(locala.jNF, localx.field_username))) && (SelectDelRoomMemberUI.b(locala.jNF, localx.field_username).contains(paramAnonymousCharSequence)))
              {
                localArrayList.add(localx);
              }
              else if ((localx.vj() != null) && (localx.vj().toUpperCase().contains(paramAnonymousCharSequence.toUpperCase())))
              {
                localArrayList.add(localx);
              }
              else if ((localx.qR() != null) && (localx.qR().toUpperCase().contains(paramAnonymousCharSequence.toUpperCase())))
              {
                localArrayList.add(localx);
              }
              else if ((localx.qQ() != null) && (localx.qQ().contains(paramAnonymousCharSequence)))
              {
                localArrayList.add(localx);
              }
              else if ((localx.field_username != null) && (localx.field_username.contains(paramAnonymousCharSequence)))
              {
                localArrayList.add(localx);
              }
              else if (!com.tencent.mm.l.a.eE(localx.field_type))
              {
                at.AR();
                bb localbb = c.yL().CC(localx.field_username);
                if ((localbb != null) && (localbb.field_conRemark != null) && (localbb.field_conRemark.toUpperCase().contains(paramAnonymousCharSequence.toUpperCase()))) {
                  localArrayList.add(localx);
                }
              }
            }
          }
          w.i("MicroMsg.SelectDelRoomMemberUI", "--->setMemberListBySearch:search");
        }
        for (SelectDelRoomMemberUI.a.eNC = localArrayList;; SelectDelRoomMemberUI.a.eNC = SelectDelRoomMemberUI.a.jQW)
        {
          locala.notifyDataSetChanged();
          GMTrace.o(9145864421376L, 68142);
          return;
        }
      }
    });
    this.Ev = ((ListView)findViewById(R.h.bmj));
    new x();
    q localq = this.jNF;
    String str = this.jOR;
    Object localObject = new LinkedList();
    if (!bg.nm(this.jQJ)) {
      localObject = bg.g(this.jQJ.split(","));
    }
    at.AR();
    ay localay = c.yS().CB("@t.qq.com");
    if (localay != null) {
      ((List)localObject).add(localay.name);
    }
    this.jRd = new a(this, localq, str, (List)localObject, this.jPi);
    this.Ev.setAdapter(this.jRd);
    this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9083453177856L, 67677);
        SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this);
        paramAnonymousAdapterView = SelectDelRoomMemberUI.a.me(paramAnonymousInt);
        if (paramAnonymousAdapterView == null)
        {
          GMTrace.o(9083453177856L, 67677);
          return;
        }
        SelectDelRoomMemberUI.a(SelectDelRoomMemberUI.this, paramAnonymousAdapterView.field_username);
        paramAnonymousView = paramAnonymousAdapterView.field_nickname;
        String str = SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.c(SelectDelRoomMemberUI.this), SelectDelRoomMemberUI.d(SelectDelRoomMemberUI.this));
        if (bg.nm(str)) {
          SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this, paramAnonymousAdapterView.vk());
        }
        for (;;)
        {
          SelectDelRoomMemberUI.a(SelectDelRoomMemberUI.this, SelectDelRoomMemberUI.d(SelectDelRoomMemberUI.this), SelectDelRoomMemberUI.e(SelectDelRoomMemberUI.this), paramAnonymousView);
          GMTrace.o(9083453177856L, 67677);
          return;
          SelectDelRoomMemberUI.b(SelectDelRoomMemberUI.this, str);
        }
      }
    });
    Qe();
    GMTrace.o(9154051702784L, 68203);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9153917485056L, 68202);
    int i = R.i.cuo;
    GMTrace.o(9153917485056L, 68202);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9154185920512L, 68204);
    super.onCreate(paramBundle);
    this.hqM = new HashSet();
    MP();
    GMTrace.o(9154185920512L, 68204);
  }
  
  public void onResume()
  {
    GMTrace.i(9154320138240L, 68205);
    super.onResume();
    if (this.jRd != null)
    {
      at.AR();
      this.jNF = c.yT().gC(this.jOR);
      List localList = com.tencent.mm.y.m.fi(this.jOR);
      if (this.jRd != null) {
        this.jRd.aj(localList);
      }
    }
    GMTrace.o(9154320138240L, 68205);
  }
  
  private static final class a
    extends BaseAdapter
  {
    static List<x> eNC;
    static List<x> jQW;
    private List<String> iVA;
    private String jNA;
    q jNF;
    String jQT;
    private String jQV;
    private c jQm;
    a jRh;
    private Context mContext;
    
    static
    {
      GMTrace.i(9105062232064L, 67838);
      eNC = new ArrayList();
      GMTrace.o(9105062232064L, 67838);
    }
    
    public a(Context paramContext, q paramq, String paramString1, List<String> paramList, String paramString2)
    {
      GMTrace.i(9103988490240L, 67830);
      this.jRh = null;
      this.jQV = null;
      this.jNF = paramq;
      this.jNA = paramString1;
      this.iVA = paramList;
      this.mContext = paramContext;
      this.jQV = paramString2;
      this.jQm = at.AR();
      aj(com.tencent.mm.y.m.fi(paramString1));
      GMTrace.o(9103988490240L, 67830);
    }
    
    public static x me(int paramInt)
    {
      GMTrace.i(9104256925696L, 67832);
      x localx = (x)eNC.get(paramInt);
      GMTrace.o(9104256925696L, 67832);
      return localx;
    }
    
    public final void aj(List<String> paramList)
    {
      GMTrace.i(9104122707968L, 67831);
      if (paramList == null)
      {
        GMTrace.o(9104122707968L, 67831);
        return;
      }
      eNC.clear();
      int i = 0;
      if (i < paramList.size())
      {
        x localx = c.yK().TE((String)paramList.get(i));
        if ((localx != null) && (localx.field_username.equals(this.jQV))) {
          eNC.add(0, localx);
        }
        for (;;)
        {
          i += 1;
          break;
          eNC.add(localx);
        }
      }
      jQW = eNC;
      notifyDataSetChanged();
      GMTrace.o(9104122707968L, 67831);
    }
    
    public final int getCount()
    {
      GMTrace.i(9104525361152L, 67834);
      int i = eNC.size();
      GMTrace.o(9104525361152L, 67834);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9104659578880L, 67835);
      long l = paramInt;
      GMTrace.o(9104659578880L, 67835);
      return l;
    }
    
    public final View getView(int paramInt, final View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9104391143424L, 67833);
      Object localObject = (x)eNC.get(paramInt);
      View localView;
      if (paramView == null)
      {
        localView = View.inflate(this.mContext, R.i.cun, null);
        this.jRh = new a();
        this.jRh.jRj = ((MaskLayout)localView.findViewById(R.h.cbi));
        this.jRh.jtr = ((TextView)localView.findViewById(R.h.cbk));
        paramView = (WindowManager)this.mContext.getSystemService("window");
        this.jRh.jtr.setMaxWidth(paramView.getDefaultDisplay().getWidth() * 2 / 3);
        this.jRh.jRk = ((TextView)localView.findViewById(R.h.cbj));
        this.jRh.jRk.setMaxWidth(paramView.getDefaultDisplay().getWidth() * 2 / 3);
        this.jRh.jRl = ((ImageView)localView.findViewById(R.h.bYV));
        this.jRh.jRm = ((ImageButton)localView.findViewById(R.h.biF));
        localView.setTag(this.jRh);
      }
      while (localObject == null)
      {
        GMTrace.o(9104391143424L, 67833);
        return localView;
        this.jRh = ((a)paramView.getTag());
        localView = paramView;
      }
      paramView = this.jRh.jtr;
      paramViewGroup = this.mContext;
      label389:
      String str;
      if (!com.tencent.mm.y.s.gm(((af)localObject).field_username))
      {
        paramInt = R.e.aOq;
        paramView.setTextColor(com.tencent.mm.br.a.U(paramViewGroup, paramInt));
        if (!this.jNF.field_roomowner.equals(((af)localObject).field_username)) {
          break label644;
        }
        this.jRh.jRm.setVisibility(8);
        ((LargeTouchableAreasItemView)localView).jOK = null;
        a.b.a((ImageView)this.jRh.jRj.view, ((af)localObject).field_username);
        if (((af)localObject).field_verifyFlag == 0) {
          break label749;
        }
        if (ak.a.gmZ == null) {
          break label736;
        }
        paramView = ak.a.gmZ.fs(((af)localObject).field_verifyFlag);
        if (paramView == null) {
          break label723;
        }
        paramView = com.tencent.mm.af.m.iX(paramView);
        this.jRh.jRj.d(paramView, MaskLayout.a.wgw);
        str = SelectDelRoomMemberUI.b(this.jNF, ((af)localObject).field_username);
        if (bg.nm(((af)localObject).field_conRemark)) {
          break label762;
        }
        paramView = ((af)localObject).field_conRemark;
        label420:
        paramViewGroup = paramView;
        if (bg.nm(paramView)) {
          paramViewGroup = ((x)localObject).vj();
        }
        paramView = paramViewGroup;
        if (str != null)
        {
          paramView = paramViewGroup;
          if (!str.equals(""))
          {
            paramView = paramViewGroup;
            if (!paramViewGroup.equals(str)) {
              paramView = str + "( " + paramViewGroup + " )";
            }
          }
        }
        if (com.tencent.mm.l.a.eE(((af)localObject).field_type)) {
          break label768;
        }
        at.AR();
        localObject = c.yL().CC(((af)localObject).field_username);
        if (localObject == null) {
          break label793;
        }
        str = ((bb)localObject).field_conDescription;
        paramViewGroup = str;
        if (!bg.nm(((bb)localObject).field_conRemark))
        {
          paramView = ((bb)localObject).field_conRemark;
          paramViewGroup = str;
        }
      }
      for (;;)
      {
        label563:
        if (!bg.nm(paramViewGroup)) {
          this.jRh.jRk.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, paramViewGroup, this.jRh.jRk.getTextSize()));
        }
        for (;;)
        {
          this.jRh.jtr.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, paramView, this.jRh.jtr.getTextSize()));
          GMTrace.o(9104391143424L, 67833);
          return localView;
          paramInt = R.e.aOr;
          break;
          label644:
          if (((SelectDelRoomMemberUI)this.mContext).hqM.contains(((af)localObject).field_username)) {
            ((LargeTouchableAreasItemView)localView).dE(true);
          }
          for (;;)
          {
            this.jRh.jRm.setVisibility(0);
            paramView = ((af)localObject).field_username;
            ((LargeTouchableAreasItemView)localView).jOK = new LargeTouchableAreasItemView.a()
            {
              public final void dF(boolean paramAnonymousBoolean)
              {
                GMTrace.i(9115531214848L, 67916);
                if (paramAnonymousBoolean) {
                  ((SelectDelRoomMemberUI)SelectDelRoomMemberUI.a.a(SelectDelRoomMemberUI.a.this)).hqM.add(paramView);
                }
                for (;;)
                {
                  SelectDelRoomMemberUI.f((SelectDelRoomMemberUI)SelectDelRoomMemberUI.a.a(SelectDelRoomMemberUI.a.this));
                  GMTrace.o(9115531214848L, 67916);
                  return;
                  ((SelectDelRoomMemberUI)SelectDelRoomMemberUI.a.a(SelectDelRoomMemberUI.a.this)).hqM.remove(paramView);
                }
              }
            };
            break;
            ((LargeTouchableAreasItemView)localView).dE(false);
          }
          label723:
          this.jRh.jRj.caA();
          break label389;
          label736:
          this.jRh.jRj.caA();
          break label389;
          label749:
          this.jRh.jRj.caA();
          break label389;
          label762:
          paramView = str;
          break label420;
          label768:
          paramViewGroup = ((af)localObject).fjt;
          break label563;
          this.jRh.jRk.setText("");
        }
        label793:
        paramViewGroup = "";
      }
    }
    
    private static final class a
    {
      public MaskLayout jRj;
      public TextView jRk;
      public ImageView jRl;
      public ImageButton jRm;
      public TextView jtr;
      
      public a()
      {
        GMTrace.i(9112846860288L, 67896);
        GMTrace.o(9112846860288L, 67896);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\SelectDelRoomMemberUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */