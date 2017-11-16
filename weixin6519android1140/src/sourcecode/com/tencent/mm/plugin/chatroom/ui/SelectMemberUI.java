package com.tencent.mm.plugin.chatroom.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.HandlerThread;
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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.af.m;
import com.tencent.mm.bj.d;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.base.MaskLayout.a;
import com.tencent.mm.ui.base.VerticalScrollBar.a;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.y.ae;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.c;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class SelectMemberUI
  extends MMActivity
  implements e
{
  private ListView Ev;
  private View iTF;
  private r ihl;
  private q jNF;
  private String jOR;
  private String jQJ;
  private MMEditText jQN;
  private boolean jRA;
  private View jRo;
  SelectMemberScrollBar jRx;
  private b jRy;
  private boolean jRz;
  private int jtE;
  private String mTitle;
  
  public SelectMemberUI()
  {
    GMTrace.i(9147340816384L, 68153);
    GMTrace.o(9147340816384L, 68153);
  }
  
  protected static String a(q paramq, String paramString)
  {
    GMTrace.i(9148146122752L, 68159);
    if (paramq == null)
    {
      GMTrace.o(9148146122752L, 68159);
      return null;
    }
    paramq = paramq.fs(paramString);
    GMTrace.o(9148146122752L, 68159);
    return paramq;
  }
  
  protected final void MP()
  {
    GMTrace.i(9147877687296L, 68157);
    sq(bg.nl(this.mTitle));
    this.Ev = ((ListView)findViewById(R.h.bML));
    this.jRo = findViewById(R.h.cbG);
    this.iTF = findViewById(R.h.cbH);
    this.jRy = new b(this, this.jNF, this.jOR, this.jNF.field_roomowner);
    this.Ev.setAdapter(this.jRy);
    this.jRx = ((SelectMemberScrollBar)findViewById(R.h.bMN));
    this.jRx.setVisibility(0);
    this.jRx.wiZ = new VerticalScrollBar.a()
    {
      public final void uW(String paramAnonymousString)
      {
        GMTrace.i(9111638900736L, 67887);
        if ("↑".equals(paramAnonymousString))
        {
          SelectMemberUI.a(SelectMemberUI.this).setSelection(0);
          GMTrace.o(9111638900736L, 67887);
          return;
        }
        SelectMemberUI.b localb = SelectMemberUI.b(SelectMemberUI.this);
        if (localb.jRG.containsKey(paramAnonymousString)) {}
        for (int i = ((Integer)localb.jRG.get(paramAnonymousString)).intValue();; i = -1)
        {
          if (i != -1) {
            SelectMemberUI.a(SelectMemberUI.this).setSelection(i);
          }
          GMTrace.o(9111638900736L, 67887);
          return;
        }
      }
    };
    this.jQN = ((MMEditText)findViewById(R.h.cbF));
    this.jQN.addTextChangedListener(new TextWatcher()
    {
      private aj jRC;
      
      public final void afterTextChanged(Editable paramAnonymousEditable)
      {
        GMTrace.i(9158078234624L, 68233);
        GMTrace.o(9158078234624L, 68233);
      }
      
      public final void beforeTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9157944016896L, 68232);
        GMTrace.o(9157944016896L, 68232);
      }
      
      public final void onTextChanged(CharSequence paramAnonymousCharSequence, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
      {
        GMTrace.i(9157809799168L, 68231);
        this.jRC.stopTimer();
        this.jRC.z(500L, 500L);
        GMTrace.o(9157809799168L, 68231);
      }
    });
    this.Ev.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(9084258484224L, 67683);
        switch (SelectMemberUI.d(SelectMemberUI.this))
        {
        default: 
          w.w("MicroMsg.SelectMemberUI", "mFromScene is default");
          GMTrace.o(9084258484224L, 67683);
          return;
        case 1: 
          SelectMemberUI.a(SelectMemberUI.this, SelectMemberUI.b(SelectMemberUI.this).mf(paramAnonymousInt).iBi.field_username);
          GMTrace.o(9084258484224L, 67683);
          return;
        }
        SelectMemberUI.a(SelectMemberUI.this, paramAnonymousInt);
        GMTrace.o(9084258484224L, 67683);
      }
    });
    b localb = this.jRy;
    localb.jRB.iTF.setVisibility(0);
    at.xB().A(new SelectMemberUI.b.1(localb));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(9098217127936L, 67787);
        SelectMemberUI.this.setResult(0);
        SelectMemberUI.this.finish();
        GMTrace.o(9098217127936L, 67787);
        return true;
      }
    });
    GMTrace.o(9147877687296L, 68157);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(9148011905024L, 68158);
    if ((this.ihl != null) && (this.ihl.isShowing())) {
      this.ihl.dismiss();
    }
    if (paramk.getType() == 990)
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        w.i("MicroMsg.SelectMemberUI", "dz[onSceneEnd transfer successfully],owner_username:%s", new Object[] { ((com.tencent.mm.plugin.chatroom.d.n)paramk).username });
        u.makeText(this, R.l.dTO, 1).show();
        paramString = new Intent();
        paramString.putExtra("RoomInfo_Id", this.jOR);
        paramString.putExtra("Chat_User", this.jOR);
        paramString.putExtra("Is_Chatroom", true);
        paramString.setFlags(67108864);
        d.b(this.vKB.vKW, "chatroom", ".ui.ChatroomInfoUI", paramString);
        finish();
        GMTrace.o(9148011905024L, 68158);
        return;
      }
      u.makeText(this, R.l.dTN, 1).show();
      w.w("MicroMsg.SelectMemberUI", "dz[onSceneEnd transfer failed: %d %d %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    }
    GMTrace.o(9148011905024L, 68158);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(9148280340480L, 68160);
    int i = R.i.cFK;
    GMTrace.o(9148280340480L, 68160);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(9147475034112L, 68154);
    super.onCreate(paramBundle);
    w.i("MicroMsg.SelectMemberUI", "[onCreate]");
    this.jOR = getIntent().getStringExtra("RoomInfo_Id");
    w.i("MicroMsg.SelectMemberUI", "[getIntentParams] roomId:%s", new Object[] { this.jOR });
    at.AR();
    this.jNF = c.yT().gD(this.jOR);
    this.jQJ = getIntent().getStringExtra("Block_list");
    this.jtE = getIntent().getIntExtra("frome_scene", 0);
    this.mTitle = getIntent().getStringExtra("title");
    this.jRz = getIntent().getBooleanExtra("quit_room", false);
    this.jRA = getIntent().getBooleanExtra("is_show_owner", true);
    MP();
    if (this.jtE == 2) {
      at.wS().a(990, this);
    }
    GMTrace.o(9147475034112L, 68154);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(9147743469568L, 68156);
    super.onDestroy();
    if (this.jtE == 2) {
      at.wS().b(990, this);
    }
    if ((this.ihl != null) && (this.ihl.isShowing())) {
      this.ihl.dismiss();
    }
    GMTrace.o(9147743469568L, 68156);
  }
  
  public final class a
  {
    public x iBi;
    public int type;
    
    public a(x paramx)
    {
      GMTrace.i(9157541363712L, 68229);
      this.type = 1;
      this.iBi = paramx;
      GMTrace.o(9157541363712L, 68229);
    }
  }
  
  public final class b
    extends BaseAdapter
  {
    List<SelectMemberUI.a> eNC;
    private q jNF;
    private String jOR;
    public String jQT;
    String jQV;
    List<SelectMemberUI.a> jQW;
    private c jQm;
    public final String jRE;
    volatile boolean jRF;
    HashMap<String, Integer> jRG;
    private Context mContext;
    
    public b(Context paramContext, q paramq, String paramString1, String paramString2)
    {
      GMTrace.i(9115933868032L, 67919);
      this.jRE = new String(Character.toChars(91));
      this.jQV = null;
      this.jQW = new ArrayList(0);
      this.eNC = new ArrayList();
      this.jRF = false;
      this.jRG = new HashMap();
      this.jNF = paramq;
      this.jOR = paramString1;
      this.jQV = paramString2;
      this.mContext = paramContext;
      this.jQm = at.AR();
      GMTrace.o(9115933868032L, 67919);
    }
    
    private String c(x paramx)
    {
      GMTrace.i(9116739174400L, 67925);
      if (!bg.nm(paramx.field_conRemark)) {}
      for (Object localObject2 = paramx.field_conRemark;; localObject2 = SelectMemberUI.a(this.jNF, paramx.field_username))
      {
        Object localObject1 = localObject2;
        if (bg.nm((String)localObject2)) {
          localObject1 = paramx.vj();
        }
        localObject2 = localObject1;
        if (!a.eE(paramx.field_type))
        {
          at.AR();
          paramx = c.yL().CC(paramx.field_username);
          localObject2 = localObject1;
          if (paramx != null)
          {
            localObject2 = localObject1;
            if (!bg.nm(paramx.field_conRemark)) {
              localObject2 = paramx.field_conRemark;
            }
          }
        }
        GMTrace.o(9116739174400L, 67925);
        return (String)localObject2;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(9116202303488L, 67921);
      if ((this.eNC == null) || (this.jRF))
      {
        GMTrace.o(9116202303488L, 67921);
        return 0;
      }
      int i = this.eNC.size();
      GMTrace.o(9116202303488L, 67921);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(9116470738944L, 67923);
      long l = paramInt;
      GMTrace.o(9116470738944L, 67923);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(9116604956672L, 67924);
      label218:
      String str;
      if (paramView == null)
      {
        paramView = View.inflate(this.mContext, R.i.cFJ, null);
        paramViewGroup = new SelectMemberUI.c();
        paramViewGroup.jRj = ((MaskLayout)paramView.findViewById(R.h.cbJ));
        paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.cbL));
        Object localObject = (WindowManager)this.mContext.getSystemService("window");
        paramViewGroup.jtr.setMaxWidth(((WindowManager)localObject).getDefaultDisplay().getWidth() * 2 / 3);
        paramViewGroup.jRk = ((TextView)paramView.findViewById(R.h.cbK));
        paramViewGroup.jRk.setMaxWidth(((WindowManager)localObject).getDefaultDisplay().getWidth() * 2 / 3);
        paramView.setTag(paramViewGroup);
        x localx = mf(paramInt).iBi;
        a.b.a((ImageView)paramViewGroup.jRj.view, localx.field_username);
        if (localx.field_verifyFlag == 0) {
          break label352;
        }
        if (ak.a.gmZ == null) {
          break label342;
        }
        localObject = ak.a.gmZ.fs(localx.field_verifyFlag);
        if (localObject == null) {
          break label332;
        }
        localObject = m.iX((String)localObject);
        paramViewGroup.jRj.d((Bitmap)localObject, MaskLayout.a.wgw);
        str = c(localx);
        localObject = "";
        if (a.eE(localx.field_type)) {
          localObject = localx.fjt;
        }
        if (bg.nm((String)localObject)) {
          break label362;
        }
        paramViewGroup.jRk.setVisibility(0);
        paramViewGroup.jRk.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, (CharSequence)localObject, paramViewGroup.jRk.getTextSize()));
      }
      for (;;)
      {
        paramViewGroup.jtr.setText(com.tencent.mm.pluginsdk.ui.d.h.b(this.mContext, str, paramViewGroup.jtr.getTextSize()));
        GMTrace.o(9116604956672L, 67924);
        return paramView;
        paramViewGroup = (SelectMemberUI.c)paramView.getTag();
        break;
        label332:
        paramViewGroup.jRj.caA();
        break label218;
        label342:
        paramViewGroup.jRj.caA();
        break label218;
        label352:
        paramViewGroup.jRj.caA();
        break label218;
        label362:
        paramViewGroup.jRk.setVisibility(8);
        paramViewGroup.jRk.setText("");
      }
    }
    
    public final SelectMemberUI.a mf(int paramInt)
    {
      GMTrace.i(9116336521216L, 67922);
      SelectMemberUI.a locala = (SelectMemberUI.a)this.eNC.get(paramInt);
      GMTrace.o(9116336521216L, 67922);
      return locala;
    }
    
    public final void uX(String paramString)
    {
      GMTrace.i(16644474667008L, 124011);
      w.i("MicroMsg.SelectMemberAdapter", "[setMemberListBySearch]");
      ArrayList localArrayList = new ArrayList();
      if (!bg.nm(paramString))
      {
        Iterator localIterator = this.jQW.iterator();
        while (localIterator.hasNext())
        {
          SelectMemberUI.a locala = (SelectMemberUI.a)localIterator.next();
          if ((locala != null) && (locala.iBi != null) && (locala.type == 1))
          {
            Object localObject = locala.iBi;
            if ((((com.tencent.mm.g.b.af)localObject).field_conRemark != null) && (((com.tencent.mm.g.b.af)localObject).field_conRemark.contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((!bg.nm(SeeRoomMemberUI.a(this.jNF, ((com.tencent.mm.g.b.af)localObject).field_username))) && (SeeRoomMemberUI.a(this.jNF, ((com.tencent.mm.g.b.af)localObject).field_username).contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).vj() != null) && (((x)localObject).vj().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qR() != null) && (((x)localObject).qR().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((x)localObject).qQ() != null) && (((x)localObject).qQ().contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if ((((com.tencent.mm.g.b.af)localObject).field_username != null) && (((com.tencent.mm.g.b.af)localObject).field_username.contains(paramString)))
            {
              localArrayList.add(locala);
            }
            else if (!a.eE(((com.tencent.mm.g.b.af)localObject).field_type))
            {
              at.AR();
              localObject = c.yL().CC(((com.tencent.mm.g.b.af)localObject).field_username);
              if ((localObject != null) && (((bb)localObject).field_conRemark != null) && (((bb)localObject).field_conRemark.contains(paramString))) {
                localArrayList.add(locala);
              }
            }
          }
        }
        this.eNC = localArrayList;
        GMTrace.o(16644474667008L, 124011);
        return;
      }
      this.eNC = this.jQW;
      GMTrace.o(16644474667008L, 124011);
    }
  }
  
  private static final class c
  {
    public MaskLayout jRj;
    public TextView jRk;
    public TextView jtr;
    
    public c()
    {
      GMTrace.i(9089761411072L, 67724);
      GMTrace.o(9089761411072L, 67724);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\chatroom\ui\SelectMemberUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */