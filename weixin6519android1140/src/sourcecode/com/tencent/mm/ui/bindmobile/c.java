package com.tencent.mm.ui.bindmobile;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.bu.g;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.q;
import java.util.LinkedList;

public final class c
  extends a
{
  private int[] gCW;
  private String htQ;
  private a.a wnM;
  private a.b wnN;
  
  public c(Context paramContext, o.a parama)
  {
    super(paramContext, new b());
    GMTrace.i(3098818904064L, 23088);
    this.wnN = new a.b()
    {
      public final void e(int paramAnonymousInt1, String paramAnonymousString, int paramAnonymousInt2)
      {
        GMTrace.i(3146600415232L, 23444);
        w.i("MicroMsg.MobileFriendAdapter", "[cpan] postion:%d md5:%s status:%d", new Object[] { Integer.valueOf(paramAnonymousInt1), paramAnonymousString, Integer.valueOf(paramAnonymousInt2) });
        final b localb = (b)c.this.getItem(paramAnonymousInt1);
        if (localb == null)
        {
          w.e("MicroMsg.MobileFriendAdapter", "[cpan] mobile Friend is null. mobile:%s", new Object[] { paramAnonymousString });
          GMTrace.o(3146600415232L, 23444);
          return;
        }
        w.d("MicroMsg.MobileFriendAdapter", "mobile friend:%s", new Object[] { localb.toString() });
        if (localb.status == 1)
        {
          paramAnonymousString = new com.tencent.mm.pluginsdk.ui.applet.a(c.a(c.this), new com.tencent.mm.pluginsdk.ui.applet.a.a()
          {
            public final void a(boolean paramAnonymous2Boolean1, boolean paramAnonymous2Boolean2, String paramAnonymous2String1, String paramAnonymous2String2)
            {
              GMTrace.i(3126870409216L, 23297);
              w.i("MicroMsg.MobileFriendAdapter", "cpan ok:%b hasSendVerify:%b  username:%s gitemId:%s", new Object[] { Boolean.valueOf(paramAnonymous2Boolean1), Boolean.valueOf(paramAnonymous2Boolean2), paramAnonymous2String1, paramAnonymous2String2 });
              b localb = af.If().jK(paramAnonymous2String2);
              if (localb != null)
              {
                if (paramAnonymous2Boolean1)
                {
                  localb.username = paramAnonymous2String1;
                  localb.status = 2;
                  localb.gsR = 2;
                  w.d("MicroMsg.MobileFriendAdapter", "f :%s", new Object[] { localb.toString() });
                  af.If().a(paramAnonymous2String2, localb);
                  c.this.QF();
                  bq.BG().c(26, new Object[0]);
                  GMTrace.o(3126870409216L, 23297);
                }
              }
              else {
                w.w("MicroMsg.MobileFriendAdapter", "cpan mobile friend is null. qq:%s", new Object[] { paramAnonymous2String2 });
              }
              GMTrace.o(3126870409216L, 23297);
            }
          });
          paramAnonymousString.twn = new com.tencent.mm.pluginsdk.ui.applet.a.b()
          {
            public final boolean aJw()
            {
              GMTrace.i(3124588707840L, 23280);
              Intent localIntent = new Intent();
              localIntent.putExtra("Contact_User", localb.getUsername());
              localIntent.putExtra("Contact_Nick", localb.GX());
              localIntent.putExtra("Contact_Scene", 13);
              localIntent.putExtra("sayhi_with_sns_perm_send_verify", true);
              localIntent.putExtra("sayhi_with_sns_perm_add_remark", true);
              localIntent.putExtra("sayhi_with_jump_to_profile", true);
              d.b(c.b(c.this), "profile", ".ui.SayHiWithSnsPermissionUI", localIntent, 1);
              GMTrace.o(3124588707840L, 23280);
              return true;
            }
          };
          if ((c.c(c.this) instanceof MobileFriendUI)) {
            ((MobileFriendUI)c.e(c.this)).vKC = new MMActivity.a()
            {
              public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, Intent paramAnonymous2Intent)
              {
                GMTrace.i(3140426399744L, 23398);
                if ((paramAnonymous2Int1 == 1) && (paramAnonymous2Int1 == -1)) {
                  ((MobileFriendUI)c.d(c.this)).b(localb);
                }
                GMTrace.o(3140426399744L, 23398);
              }
            };
          }
          paramAnonymousString.twv = localb.GS();
          paramAnonymousString.twu = false;
          LinkedList localLinkedList = new LinkedList();
          localLinkedList.add(Integer.valueOf(13));
          paramAnonymousString.b(localb.getUsername(), localLinkedList, false);
        }
        GMTrace.o(3146600415232L, 23444);
      }
    };
    this.vKu = parama;
    this.context = paramContext;
    lb(true);
    GMTrace.o(3098818904064L, 23088);
  }
  
  private static b a(b paramb, Cursor paramCursor)
  {
    GMTrace.i(3099489992704L, 23093);
    b localb = paramb;
    if (paramb == null) {
      localb = new b();
    }
    localb.b(paramCursor);
    GMTrace.o(3099489992704L, 23093);
    return localb;
  }
  
  private static String a(b paramb)
  {
    GMTrace.i(3099624210432L, 23094);
    if (paramb.gCv == 123)
    {
      GMTrace.o(3099624210432L, 23094);
      return "#";
    }
    char c = (char)paramb.gCv;
    GMTrace.o(3099624210432L, 23094);
    return String.valueOf(c);
  }
  
  public final void Au(String paramString)
  {
    GMTrace.i(3098953121792L, 23089);
    this.htQ = bg.nk(paramString.trim());
    aJe();
    QF();
    GMTrace.o(3098953121792L, 23089);
  }
  
  public final void QF()
  {
    GMTrace.i(3099221557248L, 23091);
    aJe();
    Object localObject = af.If();
    String str = this.htQ;
    StringBuilder localStringBuilder = new StringBuilder();
    if ((str != null) && (str.length() > 0))
    {
      localStringBuilder.append(" and ( ");
      localStringBuilder.append("addr_upload2.realname like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.realnamepyinitial like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.realnamequanpin like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.username like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nickname like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamepyinitial like '%" + str + "%' or ");
      localStringBuilder.append("addr_upload2.nicknamequanpin like '%" + str + "%' )");
    }
    localStringBuilder.append(" and (");
    localStringBuilder.append("addr_upload2.status=1");
    localStringBuilder.append(" or ");
    localStringBuilder.append("addr_upload2.status=2");
    localStringBuilder.append(")");
    at.AR();
    str = (String)com.tencent.mm.y.c.xh().get(6, null);
    if ((str != null) && (!str.equals(""))) {}
    for (localObject = ((com.tencent.mm.modelfriend.c)localObject).goN.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0 and moblie <> " + str + localStringBuilder.toString() + " order by showhead", null, 0);; localObject = ((com.tencent.mm.modelfriend.c)localObject).goN.a("select addr_upload2.id,addr_upload2.md5,addr_upload2.peopleid,addr_upload2.uploadtime,addr_upload2.realname,addr_upload2.realnamepyinitial,addr_upload2.realnamequanpin,addr_upload2.username,addr_upload2.nickname,addr_upload2.nicknamepyinitial,addr_upload2.nicknamequanpin,addr_upload2.type,addr_upload2.moblie,addr_upload2.email,addr_upload2.status,addr_upload2.reserved1,addr_upload2.reserved2,addr_upload2.reserved3,addr_upload2.reserved4,addr_upload2.lvbuf,addr_upload2.showhead from addr_upload2  where type = 0" + localStringBuilder.toString() + " order by showhead", null, 0))
    {
      setCursor((Cursor)localObject);
      this.gCW = new int[getCount()];
      if ((this.wnM != null) && (this.htQ != null)) {
        this.wnM.Bs(getCursor().getCount());
      }
      notifyDataSetChanged();
      GMTrace.o(3099221557248L, 23091);
      return;
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(3099087339520L, 23090);
    QF();
    GMTrace.o(3099087339520L, 23090);
  }
  
  public final void a(a.a parama)
  {
    GMTrace.i(3098684686336L, 23087);
    this.wnM = parama;
    GMTrace.o(3098684686336L, 23087);
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(3099355774976L, 23092);
    b localb = (b)getItem(paramInt);
    label168:
    label200:
    Object localObject;
    int i;
    if (paramView == null)
    {
      paramView = View.inflate(this.context, R.i.cxD, null);
      paramViewGroup = new a(paramView);
      paramView.setTag(paramViewGroup);
      paramViewGroup.vaM = paramInt;
      paramViewGroup.gUy = localb.GS();
      paramViewGroup.status = localb.status;
      paramViewGroup.iBg.setText(localb.GU());
      paramViewGroup.wnX.setText(this.context.getString(R.l.dyj) + localb.GX());
      com.tencent.mm.pluginsdk.ui.a.b.a(paramViewGroup.hqg, localb.getUsername());
      switch (localb.status)
      {
      default: 
        switch (localb.gsR)
        {
        default: 
          localObject = (b)getItem(paramInt - 1);
          if (localObject == null)
          {
            i = -1;
            label220:
            if (paramInt != 0) {
              break label678;
            }
            localObject = a(localb);
            if (!bg.nm((String)localObject)) {
              break label647;
            }
            w.w("MicroMsg.MobileFriendAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { localb.getUsername(), Integer.valueOf(paramInt) });
            paramViewGroup.qgv.setVisibility(8);
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(3099355774976L, 23092);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      if (localb.gsR == 2)
      {
        paramViewGroup.wnR.setClickable(false);
        paramViewGroup.wnR.setBackgroundDrawable(null);
        paramViewGroup.hql.setText(R.l.dyg);
        paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.aOl));
        break label168;
      }
      paramViewGroup.wnR.setClickable(true);
      paramViewGroup.wnR.setBackgroundResource(R.g.aUF);
      paramViewGroup.hql.setText(R.l.dyf);
      paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.white));
      break label168;
      at.AR();
      if ((com.tencent.mm.y.c.yK().TA(localb.getUsername())) || (q.zE().equals(localb.getUsername())))
      {
        paramViewGroup.wnR.setClickable(false);
        paramViewGroup.wnR.setBackgroundDrawable(null);
        paramViewGroup.hql.setText(R.l.dye);
        paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.aOl));
        break label168;
      }
      if (localb.gsR == 2)
      {
        paramViewGroup.wnR.setClickable(false);
        paramViewGroup.wnR.setBackgroundDrawable(null);
        paramViewGroup.hql.setText(R.l.dyi);
        paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.aOl));
        break label168;
      }
      paramViewGroup.wnR.setClickable(true);
      paramViewGroup.wnR.setBackgroundResource(R.g.aUF);
      paramViewGroup.hql.setText(R.l.dyd);
      paramViewGroup.hql.setTextColor(this.context.getResources().getColor(R.e.white));
      break label168;
      paramViewGroup.hql.setVisibility(4);
      paramViewGroup.nXP.setVisibility(0);
      break label200;
      paramViewGroup.hql.setVisibility(0);
      paramViewGroup.nXP.setVisibility(4);
      break label200;
      i = ((b)localObject).gCv;
      break label220;
      label647:
      paramViewGroup.qgv.setVisibility(0);
      paramViewGroup.qgv.setText((CharSequence)localObject);
      paramViewGroup.qgv.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
      continue;
      label678:
      if (localb.gCv != i) {}
      for (i = 1;; i = 0)
      {
        localObject = a(localb);
        if ((!bg.nm((String)localObject)) && (i != 0)) {
          break label757;
        }
        w.w("MicroMsg.MobileFriendAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { localb.getUsername(), Integer.valueOf(paramInt) });
        paramViewGroup.qgv.setVisibility(8);
        break;
      }
      label757:
      paramViewGroup.qgv.setVisibility(0);
      paramViewGroup.qgv.setText((CharSequence)localObject);
      paramViewGroup.qgv.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
    }
  }
  
  final class a
  {
    String gUy;
    ImageView hqg;
    TextView hql;
    TextView iBg;
    ProgressBar nXP;
    TextView qgv;
    int status;
    int vaM;
    View wnR;
    TextView wnX;
    
    public a(View paramView)
    {
      GMTrace.i(3125259796480L, 23285);
      this.qgv = ((TextView)paramView.findViewById(R.h.bBX));
      this.hqg = ((ImageView)paramView.findViewById(R.h.bBW));
      this.iBg = ((TextView)paramView.findViewById(R.h.bBY));
      this.wnX = ((TextView)paramView.findViewById(R.h.bCb));
      this.wnR = paramView.findViewById(R.h.bBV);
      this.hql = ((TextView)paramView.findViewById(R.h.bCa));
      this.nXP = ((ProgressBar)paramView.findViewById(R.h.bBZ));
      this.wnR.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(3117340950528L, 23226);
          if (c.f(c.this) != null) {
            c.f(c.this).e(c.a.this.vaM, c.a.this.gUy, c.a.this.status);
          }
          GMTrace.o(3117340950528L, 23226);
        }
      });
      GMTrace.o(3125259796480L, 23285);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\bindmobile\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */