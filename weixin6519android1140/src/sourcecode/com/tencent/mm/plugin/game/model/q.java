package com.tencent.mm.plugin.game.model;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.bk;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.w;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class q
  extends bk
{
  protected static c.a fTp;
  public String knW;
  private boolean lMD;
  public String lME;
  public String lMF;
  public String lMG;
  public String lMH;
  public String lMI;
  public int lMJ;
  public String lMK;
  public String lML;
  public LinkedList<h> lMM;
  public boolean lMN;
  public c lMO;
  public boolean lMP;
  public b lMQ;
  public HashMap<String, d> lMR;
  public String lMS;
  public int lMT;
  public int lMU;
  public int lMV;
  public String lMW;
  public String lMX;
  public String lMY;
  public int lMZ;
  public long lNa;
  public long lNb;
  public int lNc;
  public a lNd;
  public String lNe;
  public String lNf;
  public String lNg;
  public String lNh;
  public String lNi;
  public String lNj;
  public String lNk;
  public String lNl;
  public String lNm;
  public String lNn;
  public String lNo;
  public String lNp;
  public f lNq;
  public e lNr;
  public g lNs;
  public i lNt;
  public int lNu;
  public int lNv;
  public String lNw;
  public int lNx;
  public String lNy;
  public boolean lNz;
  public String mAppName;
  
  static
  {
    GMTrace.i(12610829287424L, 93958);
    c.a locala = new c.a();
    locala.gZM = new Field[14];
    locala.columns = new String[15];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "msgId";
    locala.vmt.put("msgId", "LONG PRIMARY KEY ");
    localStringBuilder.append(" msgId LONG PRIMARY KEY ");
    localStringBuilder.append(", ");
    locala.vms = "msgId";
    locala.columns[1] = "mergerId";
    locala.vmt.put("mergerId", "TEXT");
    localStringBuilder.append(" mergerId TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "gameMsgId";
    locala.vmt.put("gameMsgId", "TEXT");
    localStringBuilder.append(" gameMsgId TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "msgType";
    locala.vmt.put("msgType", "INTEGER");
    localStringBuilder.append(" msgType INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "createTime";
    locala.vmt.put("createTime", "LONG default '0' ");
    localStringBuilder.append(" createTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[5] = "expireTime";
    locala.vmt.put("expireTime", "LONG default '0' ");
    localStringBuilder.append(" expireTime LONG default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "appId";
    locala.vmt.put("appId", "TEXT");
    localStringBuilder.append(" appId TEXT");
    localStringBuilder.append(", ");
    locala.columns[7] = "showInMsgList";
    locala.vmt.put("showInMsgList", "INTEGER default 'true' ");
    localStringBuilder.append(" showInMsgList INTEGER default 'true' ");
    localStringBuilder.append(", ");
    locala.columns[8] = "isRead";
    locala.vmt.put("isRead", "INTEGER default 'false' ");
    localStringBuilder.append(" isRead INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[9] = "label";
    locala.vmt.put("label", "TEXT default '' ");
    localStringBuilder.append(" label TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[10] = "isHidden";
    locala.vmt.put("isHidden", "INTEGER default 'false' ");
    localStringBuilder.append(" isHidden INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[11] = "weight";
    locala.vmt.put("weight", "TEXT default '' ");
    localStringBuilder.append(" weight TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[12] = "rawXML";
    locala.vmt.put("rawXML", "TEXT default '' ");
    localStringBuilder.append(" rawXML TEXT default '' ");
    localStringBuilder.append(", ");
    locala.columns[13] = "receiveTime";
    locala.vmt.put("receiveTime", "LONG default '0' ");
    localStringBuilder.append(" receiveTime LONG default '0' ");
    locala.columns[14] = "rowid";
    locala.vmu = localStringBuilder.toString();
    fTp = locala;
    GMTrace.o(12610829287424L, 93958);
  }
  
  public q()
  {
    GMTrace.i(12610426634240L, 93955);
    this.lMD = false;
    this.knW = "";
    this.lME = "";
    this.lMF = "";
    this.mAppName = "";
    this.lMG = "";
    this.lMH = "";
    this.lMI = "";
    this.lMJ = 0;
    this.lMK = "";
    this.lML = "";
    this.lMM = new LinkedList();
    this.lMO = new c();
    this.lMQ = new b();
    this.lMR = new HashMap();
    this.lMS = "";
    this.lMT = 0;
    this.lMU = 0;
    this.lMV = 0;
    this.lMW = "";
    this.lMX = "";
    this.lMY = "";
    this.lMZ = 0;
    this.lNa = 0L;
    this.lNb = 0L;
    this.lNc = 0;
    this.lNd = new a();
    this.lNe = "";
    this.lNf = "";
    this.lNg = "";
    this.lNh = "";
    this.lNi = "";
    this.lNj = "";
    this.lNk = "";
    this.lNr = new e();
    this.lNs = new g();
    this.lNt = new i();
    this.lNx = 0;
    this.lNy = "";
    this.lNz = false;
    GMTrace.o(12610426634240L, 93955);
  }
  
  public final void aFr()
  {
    GMTrace.i(12610560851968L, 93956);
    if (this.lMD)
    {
      GMTrace.o(12610560851968L, 93956);
      return;
    }
    if (this.field_msgType == 100)
    {
      x.aFD();
      if (this == null) {
        w.e("MicroMsg.GameNewMessageParser", "msg is null");
      }
    }
    for (;;)
    {
      label52:
      this.lMD = true;
      GMTrace.o(12610560851968L, 93956);
      return;
      if (bg.nm(this.field_rawXML))
      {
        w.e("MicroMsg.GameNewMessageParser", "msg content is null");
      }
      else
      {
        Map localMap = bh.q(this.field_rawXML, "sysmsg");
        if ((localMap == null) || (localMap.size() == 0))
        {
          w.e("MicroMsg.GameNewMessageParser", "Parse failed");
        }
        else if (!"gamecenter".equalsIgnoreCase((String)localMap.get(".sysmsg.$type")))
        {
          w.e("MicroMsg.GameNewMessageParser", "Type not matched");
        }
        else
        {
          this.lNl = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.$jump_id"), "");
          this.lNm = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.user_action_title"), "");
          this.lNn = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.first_line_content"), "");
          this.lNr.lNF = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.second_line.second_line_content"), "");
          this.lNr.lNB = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.second_line.second_line_icon_url"), "");
          this.lNr.lNC = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.second_line.$jump_id"), "");
          this.lNo = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.content_pic"), "");
          this.lNp = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.content_pic.$jump_id"), "");
          if (localMap.get(".sysmsg.gamecenter.msg_center.msg_sender") != null)
          {
            this.lNq = new f();
            this.lNq.lNG = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.sender_name"), "");
            this.lNq.lNH = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.sender_icon"), "");
            this.lNq.lNI = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.badge_icon"), "");
            this.lNq.lNC = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.msg_sender.$jump_id"), "");
          }
          this.lMM.clear();
          int i = 0;
          if (i == 0) {}
          for (Object localObject = ".sysmsg.gamecenter.msg_center.userinfo";; localObject = ".sysmsg.gamecenter.msg_center.userinfo" + i)
          {
            if (!localMap.containsKey(localObject)) {
              break label749;
            }
            h localh = new h();
            localh.userName = bg.aq((String)localMap.get((String)localObject + ".username"), "");
            localh.aDn = bg.aq((String)localMap.get((String)localObject + ".nickname"), "");
            localh.lNK = bg.aq((String)localMap.get((String)localObject + ".usericon"), "");
            localh.lNM = bg.aq((String)localMap.get((String)localObject + ".badge_icon"), "");
            localh.lNN = bg.aq((String)localMap.get((String)localObject + ".$jump_id"), "");
            this.lMM.add(localh);
            i += 1;
            break;
          }
          label749:
          this.lNs.mName = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.source_info.source_name"), "");
          localObject = this.lNs;
          if (bg.getInt((String)localMap.get(".sysmsg.gamecenter.msg_center.source_info.source_clickable"), 0) > 0) {}
          for (boolean bool = true;; bool = false)
          {
            ((g)localObject).lNJ = bool;
            this.lNs.lNC = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_center.source_info.$jump_id"), "");
            x.c(localMap, this);
            x.d(localMap, this);
            this.lMQ.lNB = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_bubble_info.bubble_icon_url"), "");
            this.lMQ.fLH = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_bubble_info.bubble_desc"), "");
            this.lMQ.lNC = bg.aq((String)localMap.get(".sysmsg.gamecenter.msg_bubble_info.$jump_id"), "");
            x.e(localMap, this);
            this.lMO.lND = bg.getInt((String)localMap.get(".sysmsg.gamecenter.entrance.entrance_red_dot_type"), 0);
            this.lMO.lNB = bg.aq((String)localMap.get(".sysmsg.gamecenter.entrance.entrance_icon_url"), "");
            this.lMO.iJz = bg.aq((String)localMap.get(".sysmsg.gamecenter.entrance.entrance_text"), "");
            this.lNt.lNO = bg.aq((String)localMap.get(".sysmsg.gamecenter.display_with_wepkg.$pkg_id"), "");
            this.lNt.jCv = bg.getInt((String)localMap.get(".sysmsg.gamecenter.display_with_wepkg"), 0);
            this.lNt.lNP = bg.getLong((String)localMap.get(".sysmsg.gamecenter.display_with_wepkg.$always_display_after_time"), 0L);
            this.lMZ = bg.getInt((String)localMap.get(".sysmsg.gamecenter.wifi_flag"), 0);
            break;
          }
          if (this == null)
          {
            w.e("MicroMsg.GameMessageParser", "msg is null");
          }
          else if (bg.nm(this.field_rawXML))
          {
            w.e("MicroMsg.GameMessageParser", "msg content is null");
          }
          else
          {
            localObject = bh.q(this.field_rawXML, "sysmsg");
            if ((localObject == null) || (((Map)localObject).size() == 0))
            {
              w.e("MicroMsg.GameMessageParser", "Parse failed");
            }
            else if (!"gamecenter".equalsIgnoreCase((String)((Map)localObject).get(".sysmsg.$type")))
            {
              w.e("MicroMsg.GameMessageParser", "Type not matched");
            }
            else
            {
              this.lMZ = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.wifi_flag"), 0);
              this.knW = s.s((Map)localObject);
              this.lME = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.url"), "");
              this.lMS = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.msg_picture_url"), "");
              this.lMF = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_url"), "");
              if (bg.nm(this.lMF)) {
                this.lMF = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.url"), "");
              }
              this.lNu = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.notify_type"), 0);
              this.mAppName = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.appname2"), "");
              if (bg.nm(this.mAppName)) {
                this.mAppName = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.appname"), "");
              }
              if (this.field_msgType == 6)
              {
                this.lMK = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.groupname"), "");
                this.lML = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.groupurl"), "");
              }
              for (;;)
              {
                this.lMG = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.iconurl"), "");
                this.lMH = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.android_downloadurl"), "");
                this.lMI = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.android_apk_md5"), "");
                this.lMJ = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.appinfo.android_apk_size"), 0);
                s.a((Map)localObject, this);
                this.lNw = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.noticeid"), "");
                this.lNa = s.t((Map)localObject);
                this.lMO.lND = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.badge_display_type"), 0);
                this.lMO.lNB = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.showiconurl"), "");
                this.lMO.iJz = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.entrancetext"), "");
                s.b((Map)localObject, this);
                this.lMT = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_action"), 0);
                this.lMQ.lNB = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_icon_url"), "");
                this.lMQ.fLH = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.message_bubble_info.message_bubble_desc"), "");
                this.lNx = bg.getInt((String)((Map)localObject).get(".sysmsg.gamecenter.message_card.message_card_jump_type"), 0);
                this.lNy = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.message_card.message_card_jump_url"), "");
                switch (this.field_msgType)
                {
                case 4: 
                case 10: 
                case 11: 
                case 3: 
                case 7: 
                case 8: 
                case 9: 
                default: 
                  w.e("MicroMsg.GameMessageParser", "error gamecenter type: " + this.field_msgType);
                  break label52;
                  this.lMK = this.mAppName;
                }
              }
              this.lMU = bg.getInt((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.share_msg_type"), 1);
              this.lMV = bg.getInt((String)((Map)localObject).get(".sysmsg.game_control_info.display_name_type"), 1);
              this.lMW = bg.aq((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.share_msg_title"), "");
              this.lMX = bg.aq((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.share_msg_content"), "");
              this.lMY = bg.aq((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.media_url"), "");
              this.lMS = bg.aq((String)((Map)localObject).get(".sysmsg.gameshare.share_message_info.thumb_url"), "");
              w.i("MicroMsg.GameMessageParser", "Received a ShareMsg: %s", new Object[] { this.field_appId });
              continue;
              this.lNi = bg.aq((String)((Map)localObject).get(".sysmsg.gamepraise.praise_message_info.praise_content"), "");
              this.lNj = bg.aq((String)((Map)localObject).get(".sysmsg.gamepraise.praise_message_info.praise_jumpurl"), "");
              this.lNk = bg.aq((String)((Map)localObject).get(".sysmsg.gamepraise.praise_message_info.praise_iconurl"), "");
              continue;
              this.lNe = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.topic.reply_content"), "");
              this.lNf = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.topic.replied_content"), "");
              this.lNh = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.topic.topic_title"), "");
              this.lNg = bg.aq((String)((Map)localObject).get(".sysmsg.gamecenter.topic.topic_url"), "");
            }
          }
        }
      }
    }
  }
  
  protected final c.a uw()
  {
    GMTrace.i(12610695069696L, 93957);
    c.a locala = fTp;
    GMTrace.o(12610695069696L, 93957);
    return locala;
  }
  
  public static final class a
  {
    public boolean lMy;
    public boolean lNA;
    public int orientation;
    public String url;
    
    public a()
    {
      GMTrace.i(15198949736448L, 113241);
      GMTrace.o(15198949736448L, 113241);
    }
  }
  
  public static final class b
  {
    public String fLH;
    public String lNB;
    public String lNC;
    
    public b()
    {
      GMTrace.i(12592441458688L, 93821);
      GMTrace.o(12592441458688L, 93821);
    }
  }
  
  public static final class c
  {
    public String iJz;
    public String lNB;
    public int lND;
    
    public c()
    {
      GMTrace.i(12613379424256L, 93977);
      GMTrace.o(12613379424256L, 93977);
    }
  }
  
  public static final class d
  {
    public String kHd;
    public int lNE;
    
    public d()
    {
      GMTrace.i(12596333772800L, 93850);
      GMTrace.o(12596333772800L, 93850);
    }
  }
  
  public static final class e
  {
    public String lNB;
    public String lNC;
    public String lNF;
    
    public e()
    {
      GMTrace.i(12588414926848L, 93791);
      GMTrace.o(12588414926848L, 93791);
    }
  }
  
  public static final class f
  {
    public String lNC;
    public String lNG;
    public String lNH;
    public String lNI;
    
    public f()
    {
      GMTrace.i(12594857377792L, 93839);
      GMTrace.o(12594857377792L, 93839);
    }
  }
  
  public static final class g
  {
    public String lNC;
    public boolean lNJ;
    public String mName;
    
    public g()
    {
      GMTrace.i(12607876497408L, 93936);
      GMTrace.o(12607876497408L, 93936);
    }
  }
  
  public static final class h
  {
    public String aDn;
    public String lNK;
    public String lNL;
    public String lNM;
    public String lNN;
    public String userName;
    
    public h()
    {
      GMTrace.i(12619419222016L, 94022);
      GMTrace.o(12619419222016L, 94022);
    }
  }
  
  public static final class i
  {
    public int jCv;
    public String lNO;
    public long lNP;
    
    public i()
    {
      GMTrace.i(15199218171904L, 113243);
      this.jCv = 0;
      this.lNP = 0L;
      GMTrace.o(15199218171904L, 113243);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\model\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */