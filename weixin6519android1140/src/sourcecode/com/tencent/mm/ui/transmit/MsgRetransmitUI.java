package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.mn;
import com.tencent.mm.g.a.mn.a;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.g.a.pm;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.z;
import com.tencent.mm.pluginsdk.model.app.z.a;
import com.tencent.mm.pluginsdk.model.j.a;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.DecodeResultLogger;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory.KVStatHelper;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.chatting.En_5b8fbb1e;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.aa;
import com.tencent.mm.ui.chatting.ac;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.bq;
import com.tencent.mm.y.by;
import com.tencent.mm.y.m;
import com.tencent.mm.y.s;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import junit.framework.Assert;

public class MsgRetransmitUI
  extends MMBaseActivity
  implements com.tencent.mm.ad.e
{
  public long eDr;
  private String eIy;
  private float eMl;
  public String eQH;
  public String euR;
  private int gGV;
  private float gIN;
  private String gIO;
  private com.tencent.mm.ad.f gIl;
  private String hNz;
  private ProgressDialog htG;
  long juT;
  private int length;
  private ae mHandler;
  public int msgType;
  private long startTime;
  boolean txk;
  private boolean wqc;
  private int wwx;
  public List<String> xkG;
  private String xkH;
  private boolean xkI;
  private boolean xkJ;
  private com.tencent.mm.ui.base.i xkK;
  private int xkL;
  private int xkM;
  private com.tencent.mm.ao.k xkN;
  private boolean xkO;
  private List<String> xkP;
  private int xkQ;
  private int xkR;
  private boolean xkS;
  private boolean xkT;
  private int xkU;
  private boolean xkV;
  private boolean xkW;
  private boolean xkX;
  private int xkY;
  private int xkZ;
  private String xla;
  private String xlb;
  private int xlc;
  private boolean xld;
  boolean xle;
  
  public MsgRetransmitUI()
  {
    GMTrace.i(3026743984128L, 22551);
    this.xkH = null;
    this.xkI = true;
    this.xkJ = false;
    this.htG = null;
    this.gGV = 0;
    this.xkL = 0;
    this.xkM = 0;
    this.xkN = null;
    this.xkO = false;
    this.xkP = null;
    this.gIl = null;
    this.xkQ = 0;
    this.xkR = 0;
    this.xkS = false;
    this.xkT = false;
    this.wqc = false;
    this.wwx = -1;
    this.xkW = true;
    this.xkX = true;
    this.xkY = 0;
    this.startTime = 0L;
    this.xld = true;
    this.mHandler = new ae();
    this.xle = false;
    GMTrace.o(3026743984128L, 22551);
  }
  
  private boolean Xb(String paramString)
  {
    GMTrace.i(3027549290496L, 22557);
    f.a locala = f.a.eS(bg.Sx(this.eQH));
    w.d("MicroMsg.MsgRetransmitUI", "summerbig processAppMessageTransfer msgContent[%s], content[%s]", new Object[] { this.eQH, locala });
    if (locala == null)
    {
      w.e("MicroMsg.MsgRetransmitUI", "transfer app message error: app content null");
      GMTrace.o(3027549290496L, 22557);
      return false;
    }
    at.AR();
    au localau = com.tencent.mm.y.c.yM().cM(this.eDr);
    if ((localau.bTt()) || (localau.bTs()))
    {
      if (locala.type == 33) {
        ac.b(paramString, locala, by.b(((HashMap)getIntent().getSerializableExtra("appbrand_params")).get("img_url"), null));
      }
      for (;;)
      {
        GMTrace.o(3027549290496L, 22557);
        return true;
        aa.a(this, paramString, this.eQH, localau.field_isSend, this.wqc);
      }
    }
    String str = null;
    Object localObject = null;
    byte[] arrayOfByte1 = null;
    boolean bool;
    if (this.xkH == null)
    {
      localObject = str;
      if (this.wwx < 0)
      {
        localObject = str;
        if (localau.field_imgPath != null)
        {
          localObject = str;
          if (!localau.field_imgPath.equals(""))
          {
            str = com.tencent.mm.ao.n.IZ().x(localau.field_imgPath, true);
            localObject = arrayOfByte1;
            try
            {
              arrayOfByte1 = FileOp.c(str, 0, -1);
              localObject = arrayOfByte1;
              bool = bu(arrayOfByte1);
              localObject = arrayOfByte1;
              if (!bool)
              {
                GMTrace.o(3027549290496L, 22557);
                return false;
              }
            }
            catch (Exception localException1)
            {
              w.e("MicroMsg.MsgRetransmitUI", "send appmsg to %s, error:%s", new Object[] { paramString, localException1.getLocalizedMessage() });
            }
          }
        }
      }
    }
    for (;;)
    {
      a(paramString, locala, (byte[])localObject);
      break;
      try
      {
        byte[] arrayOfByte2 = FileOp.c(this.xkH, 0, -1);
        localObject = arrayOfByte2;
        bool = bu(arrayOfByte2);
        localObject = arrayOfByte2;
        if (!bool)
        {
          GMTrace.o(3027549290496L, 22557);
          return false;
        }
      }
      catch (Exception localException2)
      {
        w.printErrStackTrace("MicroMsg.MsgRetransmitUI", localException2, "", new Object[0]);
        w.e("MicroMsg.MsgRetransmitUI", "send appmsg to %s, error:%s", new Object[] { paramString, localException2.getLocalizedMessage() });
      }
    }
  }
  
  private void Xc(final String paramString)
  {
    GMTrace.i(3028220379136L, 22562);
    w.i("MicroMsg.MsgRetransmitUI", "sendMultiVedeo");
    paramString = new com.tencent.mm.pluginsdk.model.j(this, null, getIntent(), paramString, 1, new j.a()
    {
      public final void bJj()
      {
        GMTrace.i(3047950385152L, 22709);
        if (MsgRetransmitUI.f(MsgRetransmitUI.this) != null)
        {
          MsgRetransmitUI.f(MsgRetransmitUI.this).dismiss();
          MsgRetransmitUI.g(MsgRetransmitUI.this);
        }
        MsgRetransmitUI.this.finish();
        GMTrace.o(3047950385152L, 22709);
      }
    });
    com.tencent.mm.sdk.f.e.post(paramString, "ChattingUI_importMultiVideo");
    getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(3038286708736L, 22637);
        paramString.bJh();
        MsgRetransmitUI.this.xle = true;
        MsgRetransmitUI.this.finish();
        GMTrace.o(3038286708736L, 22637);
      }
    });
    GMTrace.o(3028220379136L, 22562);
  }
  
  /* Error */
  private static boolean Xd(String paramString)
  {
    // Byte code:
    //   0: ldc2_w 377
    //   3: sipush 22565
    //   6: invokestatic 116	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: ldc -63
    //   11: ldc_w 380
    //   14: iconst_2
    //   15: anewarray 197	java/lang/Object
    //   18: dup
    //   19: iconst_0
    //   20: aload_0
    //   21: aastore
    //   22: dup
    //   23: iconst_1
    //   24: bipush 7
    //   26: invokestatic 386	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   29: aastore
    //   30: invokestatic 388	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   33: aconst_null
    //   34: astore_1
    //   35: aload_0
    //   36: invokestatic 392	com/tencent/mm/modelsfs/FileOp:openRead	(Ljava/lang/String;)Ljava/io/InputStream;
    //   39: astore_2
    //   40: aload_2
    //   41: astore_1
    //   42: new 394	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger
    //   45: dup
    //   46: invokespecial 395	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:<init>	()V
    //   49: astore_3
    //   50: aload_2
    //   51: astore_1
    //   52: aload_2
    //   53: aload_3
    //   54: invokestatic 401	com/tencent/mm/sdk/platformtools/MMBitmapFactory:checkIsImageLegal	(Ljava/io/InputStream;Lcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Z
    //   57: ifne +66 -> 123
    //   60: aload_2
    //   61: astore_1
    //   62: aload_3
    //   63: invokevirtual 405	com/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger:getDecodeResult	()I
    //   66: sipush 2000
    //   69: if_icmplt +54 -> 123
    //   72: aload_2
    //   73: astore_1
    //   74: ldc -63
    //   76: ldc_w 407
    //   79: invokestatic 410	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: aload_2
    //   83: astore_1
    //   84: aload_0
    //   85: bipush 7
    //   87: aload_3
    //   88: invokestatic 416	com/tencent/mm/sdk/platformtools/MMBitmapFactory$KVStatHelper:getKVStatString	(Ljava/lang/Object;ILcom/tencent/mm/sdk/platformtools/MMBitmapFactory$DecodeResultLogger;)Ljava/lang/String;
    //   91: astore_3
    //   92: aload_2
    //   93: astore_1
    //   94: getstatic 422	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   97: sipush 12712
    //   100: aload_3
    //   101: invokevirtual 426	com/tencent/mm/plugin/report/service/g:A	(ILjava/lang/String;)V
    //   104: aload_2
    //   105: ifnull +7 -> 112
    //   108: aload_2
    //   109: invokevirtual 431	java/io/InputStream:close	()V
    //   112: ldc2_w 377
    //   115: sipush 22565
    //   118: invokestatic 170	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   121: iconst_0
    //   122: ireturn
    //   123: aload_2
    //   124: ifnull +7 -> 131
    //   127: aload_2
    //   128: invokevirtual 431	java/io/InputStream:close	()V
    //   131: ldc2_w 377
    //   134: sipush 22565
    //   137: invokestatic 170	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   140: iconst_1
    //   141: ireturn
    //   142: astore_1
    //   143: aconst_null
    //   144: astore_1
    //   145: ldc -63
    //   147: ldc_w 433
    //   150: iconst_1
    //   151: anewarray 197	java/lang/Object
    //   154: dup
    //   155: iconst_0
    //   156: aload_0
    //   157: aastore
    //   158: invokestatic 435	com/tencent/mm/sdk/platformtools/w:w	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   161: aload_1
    //   162: ifnull +7 -> 169
    //   165: aload_1
    //   166: invokevirtual 431	java/io/InputStream:close	()V
    //   169: ldc2_w 377
    //   172: sipush 22565
    //   175: invokestatic 170	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   178: iconst_0
    //   179: ireturn
    //   180: astore_0
    //   181: aload_1
    //   182: ifnull +7 -> 189
    //   185: aload_1
    //   186: invokevirtual 431	java/io/InputStream:close	()V
    //   189: aload_0
    //   190: athrow
    //   191: astore_0
    //   192: goto -80 -> 112
    //   195: astore_0
    //   196: goto -65 -> 131
    //   199: astore_0
    //   200: goto -31 -> 169
    //   203: astore_1
    //   204: goto -15 -> 189
    //   207: astore_0
    //   208: goto -27 -> 181
    //   211: astore_1
    //   212: aload_2
    //   213: astore_1
    //   214: goto -69 -> 145
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	paramString	String
    //   34	60	1	localObject1	Object
    //   142	1	1	localFileNotFoundException1	java.io.FileNotFoundException
    //   144	42	1	localObject2	Object
    //   203	1	1	localException	Exception
    //   211	1	1	localFileNotFoundException2	java.io.FileNotFoundException
    //   213	1	1	localObject3	Object
    //   39	174	2	localInputStream	java.io.InputStream
    //   49	52	3	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   35	40	142	java/io/FileNotFoundException
    //   35	40	180	finally
    //   42	50	180	finally
    //   52	60	180	finally
    //   62	72	180	finally
    //   74	82	180	finally
    //   84	92	180	finally
    //   94	104	180	finally
    //   108	112	191	java/lang/Exception
    //   127	131	195	java/lang/Exception
    //   165	169	199	java/lang/Exception
    //   185	189	203	java/lang/Exception
    //   145	161	207	finally
    //   42	50	211	java/io/FileNotFoundException
    //   52	60	211	java/io/FileNotFoundException
    //   62	72	211	java/io/FileNotFoundException
    //   74	82	211	java/io/FileNotFoundException
    //   84	92	211	java/io/FileNotFoundException
    //   94	104	211	java/io/FileNotFoundException
  }
  
  private void a(final String paramString, final int paramInt, final com.tencent.mm.ad.f paramf)
  {
    GMTrace.i(3028354596864L, 22563);
    final String str2 = com.tencent.mm.y.q.zE();
    final String str1 = "";
    at.AR();
    au localau1 = com.tencent.mm.y.c.yM().cM(this.eDr);
    if (localau1.field_msgId == this.eDr) {
      str1 = localau1.field_content;
    }
    com.tencent.mm.ao.d locald1 = null;
    if (localau1.field_msgId > 0L) {
      locald1 = com.tencent.mm.ao.n.IZ().aq(localau1.field_msgId);
    }
    Object localObject1;
    if (locald1 != null)
    {
      localObject1 = locald1;
      if (locald1.gGR > 0L) {}
    }
    else
    {
      localObject1 = locald1;
      if (localau1.field_msgSvrId > 0L) {
        localObject1 = com.tencent.mm.ao.n.IZ().ap(localau1.field_msgSvrId);
      }
    }
    if ((str1 == null) && (localau1.field_msgSvrId > 0L)) {
      str1 = ((com.tencent.mm.ao.d)localObject1).gHc;
    }
    for (;;)
    {
      if ((localObject1 != null) && ((((com.tencent.mm.ao.d)localObject1).offset < ((com.tencent.mm.ao.d)localObject1).gsL) || (((com.tencent.mm.ao.d)localObject1).gsL == 0)) && (!this.xkS))
      {
        locald1 = com.tencent.mm.ao.n.IZ().ap(localau1.field_msgSvrId);
        int i;
        Object localObject2;
        long l1;
        long l2;
        boolean bool;
        if (localau1.field_isSend == 1) {
          if (locald1.II())
          {
            i = 1;
            localObject1 = new PString();
            localObject2 = new PInt();
            PInt localPInt = new PInt();
            ((PString)localObject1).value = this.euR;
            l1 = com.tencent.mm.ao.n.IZ().a(this.euR, i, paramInt, 0, (PString)localObject1, (PInt)localObject2, localPInt);
            com.tencent.mm.ao.d locald2 = com.tencent.mm.ao.n.IZ().b(Long.valueOf(l1));
            locald2.gp(1);
            au localau2 = new au();
            localau2.setType(s.gp(paramString));
            localau2.db(paramString);
            localau2.dC(1);
            localau2.dB(1);
            localau2.dc(((PString)localObject1).value);
            localau2.dN(((PInt)localObject2).value);
            localau2.dO(localPInt.value);
            localau2.E(bc.gR(localau2.field_talker));
            if (com.tencent.mm.af.f.dL(localau2.field_talker)) {
              localau1.dh(com.tencent.mm.af.a.e.Br());
            }
            at.AR();
            l2 = com.tencent.mm.y.c.yM().P(localau2);
            if (l2 < 0L) {
              break label627;
            }
            bool = true;
            label418:
            Assert.assertTrue(bool);
            w.i("MicroMsg.MsgRetransmitUI", "NetSceneUploadMsgImg: local msgId = " + l2);
            locald2.an((int)l2);
            com.tencent.mm.ao.n.IZ().a(Long.valueOf(l1), locald2);
            localObject1 = new HashMap();
            ((HashMap)localObject1).put(Long.valueOf(l2), locald1);
            localObject2 = com.tencent.mm.ao.n.Ja();
            l1 = locald1.gGR;
            l2 = localau1.field_msgId;
            if (localau1.field_isSend != 1) {
              break label633;
            }
          }
        }
        label627:
        label633:
        for (int j = R.g.aVk;; j = R.g.aVi)
        {
          ((com.tencent.mm.ao.c)localObject2).a(l1, l2, i, localObject1, j, new com.tencent.mm.ao.c.a()
          {
            public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject)
            {
              GMTrace.i(3019227791360L, 22495);
              GMTrace.o(3019227791360L, 22495);
            }
            
            public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject, int paramAnonymousInt3, int paramAnonymousInt4, com.tencent.mm.ad.k paramAnonymousk)
            {
              GMTrace.i(3018959355904L, 22493);
              GMTrace.o(3018959355904L, 22493);
            }
            
            public final void a(long paramAnonymousLong1, long paramAnonymousLong2, int paramAnonymousInt1, int paramAnonymousInt2, Object paramAnonymousObject, int paramAnonymousInt3, int paramAnonymousInt4, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
            {
              GMTrace.i(3019093573632L, 22494);
              if ((paramAnonymousInt3 == 0) && (paramAnonymousInt4 == 0)) {}
              for (paramAnonymousInt1 = 1; (paramAnonymousObject instanceof HashMap); paramAnonymousInt1 = 0)
              {
                paramAnonymousObject = (HashMap)paramAnonymousObject;
                if (paramAnonymousObject == null) {
                  break;
                }
                paramAnonymousObject = ((HashMap)paramAnonymousObject).entrySet().iterator();
                while (((Iterator)paramAnonymousObject).hasNext())
                {
                  paramAnonymousk = (Map.Entry)((Iterator)paramAnonymousObject).next();
                  paramAnonymousString = (Long)paramAnonymousk.getKey();
                  paramAnonymousk = (com.tencent.mm.ao.d)paramAnonymousk.getValue();
                  MsgRetransmitUI.this.euR = com.tencent.mm.ao.n.IZ().l(com.tencent.mm.ao.e.c(paramAnonymousk), "", "");
                  if (paramAnonymousInt1 != 0)
                  {
                    at.AR();
                    com.tencent.mm.y.c.yM().cN(paramAnonymousString.longValue());
                    MsgRetransmitUI.a(MsgRetransmitUI.this, paramString, paramInt, str2, str1, paramf);
                  }
                }
              }
              GMTrace.o(3019093573632L, 22494);
            }
          });
          GMTrace.o(3028354596864L, 22563);
          return;
          i = 0;
          break;
          if (!locald1.II())
          {
            i = 0;
            break;
          }
          localObject1 = com.tencent.mm.ao.e.a(locald1);
          if (!com.tencent.mm.a.e.aZ(com.tencent.mm.ao.n.IZ().l(((com.tencent.mm.ao.d)localObject1).gGS, "", "")))
          {
            i = 0;
            break;
          }
          i = 1;
          break;
          bool = false;
          break label418;
        }
      }
      a(paramString, paramInt, str2, str1, paramf);
      GMTrace.o(3028354596864L, 22563);
      return;
    }
  }
  
  private void a(String paramString1, int paramInt, String paramString2, String paramString3, com.tencent.mm.ad.f paramf)
  {
    GMTrace.i(3028488814592L, 22564);
    String str;
    boolean bool;
    if (!bg.nm(this.euR))
    {
      this.xkQ = 1;
      this.xkR = 1;
      if (!Xd(this.euR))
      {
        GMTrace.o(3028488814592L, 22564);
        return;
      }
      str = this.euR;
      if (this.gGV == 0)
      {
        bool = true;
        if (!com.tencent.mm.y.q.a(str, paramString1, bool)) {
          break label238;
        }
      }
      label238:
      for (this.gGV = 1;; this.gGV = 0)
      {
        long l = System.currentTimeMillis();
        com.tencent.mm.plugin.report.service.g.ork.a(106L, 96L, 1L, false);
        this.xkN = new com.tencent.mm.ao.k(paramInt, paramString2, paramString1, this.euR, this.gGV, paramf, 0, paramString3, "", true, R.g.aVk, this.xkU, this.gIN, this.eMl);
        if (this.xkM == 1) {
          this.xkN.IP();
        }
        at.wS().a(this.xkN, 0);
        this.xkO = true;
        w.d("MicroMsg.MsgRetransmitUI", "summersafecdn jacks consumption: %d, compressType:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(this.gGV) });
        bq.BG().c(bq.gpc, null);
        GMTrace.o(3028488814592L, 22564);
        return;
        bool = false;
        break;
      }
    }
    if (this.xkS)
    {
      this.xkQ += 1;
      if (!Xd((String)this.xkP.get(0)))
      {
        GMTrace.o(3028488814592L, 22564);
        return;
      }
      str = (String)this.xkP.get(0);
      if (this.gGV != 0) {
        break label450;
      }
      bool = true;
      if (!com.tencent.mm.y.q.a(str, paramString1, bool)) {
        break label456;
      }
    }
    label450:
    label456:
    for (this.gGV = 1;; this.gGV = 0)
    {
      w.d("MicroMsg.MsgRetransmitUI", "summersafecdn multiSendType compressType:%d", new Object[] { Integer.valueOf(this.gGV) });
      this.xkN = new com.tencent.mm.ao.k(paramInt, paramString2, paramString1, (String)this.xkP.get(0), this.gGV, paramf, 0, paramString3, "", true, R.g.aVk);
      if (this.xkM == 1) {
        this.xkN.IP();
      }
      this.xkO = true;
      at.wS().a(this.xkN, 0);
      bq.BG().c(bq.gpc, null);
      GMTrace.o(3028488814592L, 22564);
      return;
      bool = false;
      break;
    }
  }
  
  private void a(final String paramString, final f.a parama, final byte[] paramArrayOfByte)
  {
    GMTrace.i(3027683508224L, 22558);
    w.d("MicroMsg.MsgRetransmitUI", "summerbig send toUser[%s], attachid[%s]", new Object[] { paramString, parama.eAE });
    Object localObject3 = l.OA(parama.eAE);
    final Object localObject2 = "";
    Object localObject1 = localObject2;
    if (localObject3 != null)
    {
      localObject1 = localObject2;
      if (((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath != null)
      {
        localObject1 = localObject2;
        if (!((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath.equals(""))
        {
          at.AR();
          localObject1 = l.ad(com.tencent.mm.y.c.zg(), parama.title, parama.giw);
          FileOp.o(((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath, (String)localObject1);
          w.i("MicroMsg.MsgRetransmitUI", "summerbig send old path[%s], title[%s] attachPath[%s]， finish[%b]", new Object[] { ((com.tencent.mm.pluginsdk.model.app.b)localObject3).field_fileFullPath, parama.title, localObject1, Boolean.valueOf(((com.tencent.mm.pluginsdk.model.app.b)localObject3).aDI()) });
        }
      }
    }
    localObject2 = f.a.a(parama);
    ((f.a)localObject2).giy = 3;
    if ((bg.nm((String)localObject1)) && ((parama.giz != 0) || (parama.giv > 26214400)))
    {
      w.i("MicroMsg.MsgRetransmitUI", "summerbig send attachPath is null islargefilemsg[%d], attachlen[%d]", new Object[] { Integer.valueOf(parama.giz), Integer.valueOf(parama.giv) });
      at.wS().a(new z(parama, null, paramString, new z.a()
      {
        public final void a(String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3, String paramAnonymousString4, String paramAnonymousString5, long paramAnonymousLong)
        {
          GMTrace.i(3015469694976L, 22467);
          w.i("MicroMsg.MsgRetransmitUI", "summerbig CheckBigFile callback new md5[%s], aesKey[%s], signature[%s], old aeskey[%s], faesKey[%s], fsignature[%s]", new Object[] { paramAnonymousString1, bg.SJ(paramAnonymousString2), bg.SJ(paramAnonymousString3), bg.SJ(parama.giJ), bg.SJ(paramAnonymousString4), bg.SJ(paramAnonymousString5) });
          if (!bg.nm(paramAnonymousString3))
          {
            l.a(localObject2, parama.appId, parama.appName, paramString, "", paramArrayOfByte, MsgRetransmitUI.a(MsgRetransmitUI.this), paramAnonymousString3);
            GMTrace.o(3015469694976L, 22467);
            return;
          }
          com.tencent.mm.ui.base.h.b(MsgRetransmitUI.this, MsgRetransmitUI.this.getString(R.l.dlS), "", true);
          MsgRetransmitUI.this.finish();
          GMTrace.o(3015469694976L, 22467);
        }
      }), 0);
      GMTrace.o(3027683508224L, 22558);
      return;
    }
    l.a((f.a)localObject2, parama.appId, parama.appName, paramString, (String)localObject1, paramArrayOfByte, this.hNz);
    if (((f.a)localObject2).type == 36) {
      if (!paramString.endsWith("chatroom")) {
        break label467;
      }
    }
    label467:
    for (int i = 1;; i = 0)
    {
      parama = URLEncoder.encode(bg.nl(((f.a)localObject2).url));
      paramArrayOfByte = URLEncoder.encode(bg.nl(((f.a)localObject2).title));
      localObject1 = URLEncoder.encode(bg.nl(((f.a)localObject2).description));
      localObject3 = URLEncoder.encode(bg.nl(((f.a)localObject2).gkQ));
      com.tencent.mm.plugin.report.service.g.ork.i(14127, new Object[] { ((f.a)localObject2).appId, ((f.a)localObject2).gkR, localObject3, paramArrayOfByte, localObject1, "", parama, Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(i), paramString });
      GMTrace.o(3027683508224L, 22558);
      return;
    }
  }
  
  private boolean bi(String paramString, boolean paramBoolean)
  {
    GMTrace.i(3027817725952L, 22559);
    if (this.euR == null)
    {
      GMTrace.o(3027817725952L, 22559);
      return false;
    }
    EmojiInfo localEmojiInfo = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP(this.euR);
    int i;
    Object localObject1;
    label76:
    Object localObject2;
    if (localEmojiInfo == null)
    {
      i = com.tencent.mm.a.e.aY(this.euR);
      if (localEmojiInfo != null) {
        break label286;
      }
      localObject1 = this.euR;
      localObject2 = new BitmapFactory.Options();
      ((BitmapFactory.Options)localObject2).inJustDecodeBounds = true;
      if (((com.tencent.mm.sdk.platformtools.d.decodeFile((String)localObject1, (BitmapFactory.Options)localObject2) == null) || (((BitmapFactory.Options)localObject2).outHeight <= com.tencent.mm.k.b.ua())) && (((BitmapFactory.Options)localObject2).outWidth <= com.tencent.mm.k.b.ua())) {
        break label615;
      }
    }
    label286:
    label521:
    label608:
    label615:
    for (int j = 1;; j = 0)
    {
      if ((i > com.tencent.mm.k.b.ub()) || (j != 0))
      {
        if (localEmojiInfo == null) {}
        for (paramString = "fileName";; paramString = localEmojiInfo.GS())
        {
          w.i("MicroMsg.MsgRetransmitUI", "emoji is over size. md5:%s size:%d", new Object[] { paramString, Integer.valueOf(this.length) });
          this.xld = false;
          this.xkJ = false;
          com.tencent.mm.ui.base.h.a(this, getString(R.l.dnU), "", getString(R.l.dCR), new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3017885614080L, 22485);
              MsgRetransmitUI.this.finish();
              GMTrace.o(3017885614080L, 22485);
            }
          });
          if (this.xkU == 1) {
            com.tencent.mm.plugin.report.service.g.ork.i(13459, new Object[] { Integer.valueOf(i), Integer.valueOf(1), localEmojiInfo.GS(), Integer.valueOf(1) });
          }
          GMTrace.o(3027817725952L, 22559);
          return true;
          i = com.tencent.mm.a.e.aY(localEmojiInfo.bUU());
          break;
          localObject1 = localEmojiInfo.bUU();
          break label76;
        }
      }
      if (this.xkU == 1)
      {
        localObject2 = com.tencent.mm.plugin.report.service.g.ork;
        if (localEmojiInfo == null)
        {
          localObject1 = "";
          ((com.tencent.mm.plugin.report.service.g)localObject2).i(13459, new Object[] { Integer.valueOf(i), Integer.valueOf(0), localObject1, Integer.valueOf(1) });
        }
      }
      else
      {
        if (!paramBoolean) {
          break label521;
        }
        if (localEmojiInfo != null) {
          break label608;
        }
        localObject1 = new WXMediaMessage(new WXEmojiObject(this.euR));
        localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(getApplicationContext(), (WXMediaMessage)localObject1, "");
      }
      for (localObject1 = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().vP((String)localObject1);; localObject1 = localEmojiInfo)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(13459, new Object[] { Integer.valueOf(i), Integer.valueOf(0), ((EmojiInfo)localObject1).GS(), Integer.valueOf(2) });
        aa.b((EmojiInfo)localObject1, paramString);
        finish();
        GMTrace.o(3027817725952L, 22559);
        return true;
        localObject1 = localEmojiInfo.GS();
        break;
        if ((localEmojiInfo != null) && (i > com.tencent.mm.k.b.tZ()))
        {
          aa.b(localEmojiInfo, paramString);
          GMTrace.o(3027817725952L, 22559);
          return true;
        }
        if (((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().m(this, paramString, this.euR))
        {
          GMTrace.o(3027817725952L, 22559);
          return true;
        }
        w.e("MicroMsg.MsgRetransmitUI", "Retransmit emoji failed.");
        GMTrace.o(3027817725952L, 22559);
        return false;
      }
    }
  }
  
  private static boolean bu(byte[] paramArrayOfByte)
  {
    GMTrace.i(3028757250048L, 22566);
    w.i("MicroMsg.MsgRetransmitUI", "isImage called, data[0-4]:[%d,%d,%d,%d,%d], scene:%d", new Object[] { Byte.valueOf(paramArrayOfByte[0]), Byte.valueOf(paramArrayOfByte[1]), Byte.valueOf(paramArrayOfByte[2]), Byte.valueOf(paramArrayOfByte[3]), Byte.valueOf(paramArrayOfByte[4]), Integer.valueOf(6) });
    MMBitmapFactory.DecodeResultLogger localDecodeResultLogger = new MMBitmapFactory.DecodeResultLogger();
    if ((!MMBitmapFactory.checkIsImageLegal(paramArrayOfByte, localDecodeResultLogger)) && (localDecodeResultLogger.getDecodeResult() >= 2000))
    {
      w.w("MicroMsg.MsgRetransmitUI", "try to send illegal image.");
      paramArrayOfByte = MMBitmapFactory.KVStatHelper.getKVStatString(paramArrayOfByte, 6, localDecodeResultLogger);
      com.tencent.mm.plugin.report.service.g.ork.A(12712, paramArrayOfByte);
      GMTrace.o(3028757250048L, 22566);
      return false;
    }
    GMTrace.o(3028757250048L, 22566);
    return true;
  }
  
  private void ciE()
  {
    GMTrace.i(3027280855040L, 22555);
    Object localObject6;
    switch (this.xkM)
    {
    default: 
      w.e("MicroMsg.MsgRetransmitUI", "unknown scene %s", new Object[] { Integer.valueOf(this.xkM) });
      finish();
      GMTrace.o(3027280855040L, 22555);
      return;
    case 0: 
      int i;
      switch (this.msgType)
      {
      case 3: 
      default: 
        w.e("MicroMsg.MsgRetransmitUI", "unknown type %s", new Object[] { Integer.valueOf(this.msgType) });
      case 2: 
      case 6: 
      case 10: 
      case 12: 
      case 13: 
      case 14: 
      case 16: 
        i = 1;
      }
      final Object localObject2;
      boolean bool1;
      for (;;)
      {
        if (i != 0)
        {
          if ((this.msgType == 11) || (this.msgType == 1))
          {
            localObject1 = this.xkG;
            w.i("MicroMsg.MsgRetransmitUI", "processVideoTransfer");
            if ((11 == this.msgType) && (t.my(this.euR)))
            {
              com.tencent.mm.ui.snackbar.a.c(this, getResources().getString(R.l.dXF), "");
              this.mHandler.postDelayed(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(3049024126976L, 22717);
                  MsgRetransmitUI.this.finish();
                  GMTrace.o(3049024126976L, 22717);
                }
              }, 1800L);
              GMTrace.o(3027280855040L, 22555);
              return;
              if (ciF()) {
                break;
              }
              finish();
              i = 0;
              continue;
              if ((this.eQH != null) && (!this.eQH.equals(""))) {
                break;
              }
              w.e("MicroMsg.MsgRetransmitUI", "Transfer text erro: content null");
              finish();
              i = 0;
              continue;
              finish();
              i = 0;
              continue;
              if (!ciF())
              {
                finish();
                i = 0;
                continue;
              }
              if (this.euR != null) {
                break;
              }
              w.e("MicroMsg.MsgRetransmitUI", "Transfer fileName erro: fileName null");
              finish();
              i = 0;
              continue;
              if ((this.eQH != null) && (!this.eQH.equals(""))) {
                break;
              }
              w.e("MicroMsg.MsgRetransmitUI", "Transfer text erro: content null");
              finish();
              i = 0;
              continue;
            }
            localObject3 = new b();
            ((b)localObject3).xlt = new LinkedList();
            ((b)localObject3).xlt.addAll((Collection)localObject1);
            localObject4 = ((List)localObject1).iterator();
            if (((Iterator)localObject4).hasNext())
            {
              localObject5 = (String)((Iterator)localObject4).next();
              localObject1 = new a();
              getString(R.l.cUG);
              this.htG = com.tencent.mm.ui.base.h.a(this, getString(R.l.cUt), true, new DialogInterface.OnCancelListener()
              {
                public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                {
                  GMTrace.i(3016543436800L, 22475);
                  localObject1.xll = true;
                  GMTrace.o(3016543436800L, 22475);
                }
              });
              ((a)localObject1).context = this;
              ((a)localObject1).euR = this.euR;
              ((a)localObject1).hul = this.htG;
              ((a)localObject1).xkL = this.xkL;
              ((a)localObject1).hcv = this.length;
              ((a)localObject1).haG = this.msgType;
              ((a)localObject1).xln = false;
              ((a)localObject1).userName = ((String)localObject5);
              ((a)localObject1).xlo = true;
              ((a)localObject1).xkJ = this.xkJ;
              ((a)localObject1).xlr = ((b)localObject3);
              localObject2 = t.mw(this.euR);
              if ((localObject2 != null) && (((r)localObject2).hcE != null))
              {
                w.d("MicroMsg.MsgRetransmitUI", "msgRetrans streamvideo");
                ((a)localObject1).xlq = ((r)localObject2).hcE;
                ((a)localObject1).fwv = ((r)localObject2).Nq();
              }
              ((a)localObject1).execute(new Object[0]);
              bq.BG().c(bq.gpd, null);
              if (this.eDr != -1L)
              {
                at.AR();
                localObject6 = com.tencent.mm.y.c.yM().cM(this.eDr);
                bool1 = s.eb((String)localObject5);
                if (bool1)
                {
                  localObject1 = a.c.wqA;
                  if (!this.xkV) {
                    break label778;
                  }
                  localObject2 = a.d.wqE;
                  if (!bool1) {
                    break label786;
                  }
                }
                for (i = m.fk((String)localObject5);; i = 0)
                {
                  com.tencent.mm.ui.chatting.a.a((a.c)localObject1, (a.d)localObject2, (au)localObject6, i);
                  break;
                  localObject1 = a.c.wqz;
                  break label735;
                  localObject2 = a.d.wqD;
                  break label747;
                }
              }
            }
            GMTrace.o(3027280855040L, 22555);
            return;
          }
          if (this.msgType == 0) {
            this.xkY = this.xkG.size();
          }
          i = this.xkG.size();
          localObject1 = this.xkG.iterator();
          bool1 = true;
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            i -= 1;
            boolean bool2;
            if (i == 0)
            {
              bool2 = true;
              switch (this.msgType)
              {
              }
            }
            for (;;)
            {
              if (this.xkT) {
                com.tencent.mm.ui.chatting.ab.lW(bool2);
              }
              break;
              bool2 = false;
              break label876;
              at.xB().bQf();
              at.xB().A(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(3032917999616L, 22597);
                  w.i("MicroMsg.MsgRetransmitUI", "test before sendMutiImage");
                  MsgRetransmitUI.a(MsgRetransmitUI.this, localObject2);
                  GMTrace.o(3032917999616L, 22597);
                }
              });
              continue;
              bool1 = Xb((String)localObject2);
              continue;
              com.tencent.mm.y.q.zE();
              localObject2 = new com.tencent.mm.modelmulti.j((String)localObject2, this.eQH, s.go((String)localObject2));
              at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
              bool1 = true;
              continue;
              bool1 = bi((String)localObject2, false);
              continue;
              localObject3 = f.a.eS(bg.Sx(this.eQH));
              if (localObject3 == null)
              {
                w.e("MicroMsg.MsgRetransmitUI", "transfer app message error: app content null");
                bool1 = false;
              }
              else
              {
                a((String)localObject2, (f.a)localObject3, null);
                bool1 = true;
                continue;
                localObject2 = new com.tencent.mm.modelvoice.f(com.tencent.mm.modelvoice.q.e((String)localObject2, this.euR, this.length), 1);
                at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
                bool1 = true;
                continue;
                localObject2 = new com.tencent.mm.modelmulti.j((String)localObject2, this.eQH, 42);
                at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
                continue;
                localObject2 = new com.tencent.mm.modelmulti.j((String)localObject2, this.eQH, 48);
                at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
                bool1 = true;
                continue;
                localObject3 = new mn();
                ((mn)localObject3).eRu.type = 4;
                localObject4 = ((mn)localObject3).eRu;
                at.AR();
                ((mn.a)localObject4).eRz = com.tencent.mm.y.c.yM().cM(this.eDr);
                ((mn)localObject3).eRu.toUser = ((String)localObject2);
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
                continue;
                com.tencent.mm.ui.chatting.ab.l(this, (String)localObject2, bool2);
                continue;
                com.tencent.mm.ui.chatting.ab.k(this, (String)localObject2, bool2);
                continue;
                localObject3 = new ow();
                ((ow)localObject3).eTN.eCL = this.eDr;
                ((ow)localObject3).eTN.eLl = this.eQH;
                ((ow)localObject3).eTN.eLm = ((String)localObject2);
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
              }
            }
          }
          localObject3 = (String)this.xkG.get(0);
          switch (this.msgType)
          {
          case 3: 
          case 15: 
          default: 
            finish();
          }
        }
      }
      GMTrace.o(3027280855040L, 22555);
      return;
      GMTrace.o(3027280855040L, 22555);
      return;
      if ((this.msgType == 2) || (this.msgType == 16))
      {
        localObject4 = f.a.eS(bg.Sx(this.eQH));
        if ((localObject4 != null) && (((f.a)localObject4).type == 5) && (!bg.nm(((f.a)localObject4).url))) {
          localObject1 = "";
        }
      }
      else
      {
        try
        {
          localObject2 = URLEncoder.encode(((f.a)localObject4).url, "UTF-8");
          localObject1 = localObject2;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.MsgRetransmitUI", localUnsupportedEncodingException, "", new Object[0]);
            continue;
            i = 2;
          }
        }
        if (bool1)
        {
          i = 1;
          w.d("MicroMsg.MsgRetransmitUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((f.a)localObject4).url, Long.valueOf(this.startTime), Integer.valueOf(this.xkZ), Integer.valueOf(1), Integer.valueOf(i) });
          com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { localObject1, Long.valueOf(this.startTime), Integer.valueOf(this.xkZ), Integer.valueOf(1), Integer.valueOf(i) });
        }
      }
      while (bool1)
      {
        if (this.xkJ) {
          com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.dCJ));
        }
        if (this.xld) {
          this.mHandler.postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(3014664388608L, 22461);
              MsgRetransmitUI.this.finish();
              GMTrace.o(3014664388608L, 22461);
            }
          }, 1800L);
        }
        if ((this.xkI) && (!this.xkW))
        {
          localObject1 = new Intent(this, En_5b8fbb1e.class);
          ((Intent)localObject1).addFlags(67108864);
          ((Intent)localObject1).putExtra("Chat_User", (String)localObject3);
          startActivity((Intent)localObject1);
        }
        GMTrace.o(3027280855040L, 22555);
        return;
        if ((!bool1) && (localObject4 != null) && (((f.a)localObject4).type == 33))
        {
          localObject1 = new com.tencent.mm.g.a.n();
          ((com.tencent.mm.g.a.n)localObject1).eAt.scene = this.xlc;
          if (2 == this.xlc)
          {
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAv = (this.xlb + ":" + this.xla);
            if (!((String)localObject3).endsWith("@chatroom")) {
              break label2031;
            }
          }
          for (((com.tencent.mm.g.a.n)localObject1).eAt.action = 2;; ((com.tencent.mm.g.a.n)localObject1).eAt.action = 1)
          {
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAu = (((f.a)localObject4).gkY + 1);
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAw = ((f.a)localObject4).gkQ;
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAr = ((f.a)localObject4).gkR;
            ((com.tencent.mm.g.a.n)localObject1).eAt.appId = ((f.a)localObject4).gkS;
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAx = "";
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAy = bg.Pu();
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAz = 2;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
            break;
            ((com.tencent.mm.g.a.n)localObject1).eAt.eAv = this.xlb;
            break label1899;
          }
        }
      }
      finish();
      GMTrace.o(3027280855040L, 22555);
      return;
    case 1: 
      label735:
      label747:
      label778:
      label786:
      label876:
      label1899:
      label2031:
      localObject1 = (String)this.xkG.get(0);
      if (!ciF())
      {
        finish();
        GMTrace.o(3027280855040L, 22555);
        return;
      }
      switch (this.msgType)
      {
      default: 
        w.i("MicroMsg.MsgRetransmitUI", "doRetransmitOnSceneShareFromSystemGallery unknown msg type:%d", new Object[] { Integer.valueOf(this.msgType) });
        GMTrace.o(3027280855040L, 22555);
        return;
      case 0: 
        if ((this.xkP != null) && (this.xkP.size() > 0)) {
          this.xkR = this.xkP.size();
        }
        this.gIl = new com.tencent.mm.ad.f()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, com.tencent.mm.ad.k paramAnonymousk)
          {
            GMTrace.i(3016811872256L, 22477);
            if ((MsgRetransmitUI.b(MsgRetransmitUI.this) == null) || (paramAnonymousInt2 == 0))
            {
              GMTrace.o(3016811872256L, 22477);
              return;
            }
            paramAnonymousInt1 = (int)(paramAnonymousInt1 * 100L / paramAnonymousInt2);
            MsgRetransmitUI.b(MsgRetransmitUI.this).setMessage(MsgRetransmitUI.this.getString(R.l.dJs, new Object[] { Integer.valueOf(MsgRetransmitUI.c(MsgRetransmitUI.this)), Integer.valueOf(MsgRetransmitUI.d(MsgRetransmitUI.this)), Integer.valueOf(paramAnonymousInt1) }));
            GMTrace.o(3016811872256L, 22477);
          }
        };
        this.xkK = com.tencent.mm.ui.base.h.a(this, getString(R.l.dJs, new Object[] { Integer.valueOf(1), Integer.valueOf(this.xkR), Integer.valueOf(0) }), getString(R.l.cUG), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            GMTrace.i(3017348743168L, 22481);
            if (MsgRetransmitUI.b(MsgRetransmitUI.this) != null) {
              MsgRetransmitUI.b(MsgRetransmitUI.this).cancel();
            }
            GMTrace.o(3017348743168L, 22481);
          }
        });
        this.xkK.setOnCancelListener(new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(3038555144192L, 22639);
            com.tencent.mm.ui.base.h.a(MsgRetransmitUI.this, R.l.dJo, R.l.cUG, R.l.cUW, R.l.cTJ, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(3055332360192L, 22764);
                com.tencent.mm.ao.f localf;
                com.tencent.mm.ao.d locald;
                if (MsgRetransmitUI.e(MsgRetransmitUI.this) != null)
                {
                  at.wS().c(MsgRetransmitUI.e(MsgRetransmitUI.this));
                  paramAnonymous2Int = (int)MsgRetransmitUI.e(MsgRetransmitUI.this).gIm;
                  paramAnonymous2DialogInterface = com.tencent.mm.ao.n.IZ().gr(paramAnonymous2Int);
                  if (paramAnonymous2DialogInterface != null)
                  {
                    localf = com.tencent.mm.ao.n.IZ();
                    locald = localf.gr(paramAnonymous2Int);
                    if ((locald != null) && (locald.gGR == paramAnonymous2Int)) {
                      break label146;
                    }
                  }
                }
                for (;;)
                {
                  at.AR();
                  com.tencent.mm.y.c.yM().cN(paramAnonymous2DialogInterface.gGZ);
                  Toast.makeText(MsgRetransmitUI.this, R.l.dJp, 1).show();
                  MsgRetransmitUI.this.finish();
                  GMTrace.o(3055332360192L, 22764);
                  return;
                  label146:
                  FileOp.deleteFile(localf.l(locald.gGS, "", ""));
                  FileOp.deleteFile(localf.l(locald.gGU, "", ""));
                  FileOp.deleteFile(localf.l(locald.gGU, "", "") + "hd");
                  localf.goN.delete("ImgInfo2", "id=?", new String[] { String.valueOf(paramAnonymous2Int) });
                  if (locald.II())
                  {
                    locald = localf.gr(locald.gHb);
                    if (locald != null)
                    {
                      FileOp.deleteFile(localf.l(locald.gGS, "", ""));
                      FileOp.deleteFile(localf.l(locald.gGU, "", ""));
                      FileOp.deleteFile(localf.l(locald.gGU, "", "") + "hd");
                      localf.goN.delete("ImgInfo2", "id=?", new String[] { locald.gGR });
                    }
                  }
                }
              }
            }, new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
              {
                GMTrace.i(3039763103744L, 22648);
                if (MsgRetransmitUI.b(MsgRetransmitUI.this) != null) {
                  MsgRetransmitUI.b(MsgRetransmitUI.this).show();
                }
                GMTrace.o(3039763103744L, 22648);
              }
            });
            GMTrace.o(3038555144192L, 22639);
          }
        });
        this.xkK.setCanceledOnTouchOutside(false);
        this.xkK.getButton(-1).setText(R.l.cSk);
        a((String)localObject1, 6, this.gIl);
        GMTrace.o(3027280855040L, 22555);
        return;
      case 1: 
      case 11: 
        if (!com.tencent.mm.network.ab.bv(this))
        {
          com.tencent.mm.ui.base.h.a(this, R.l.egp, R.l.cUG, R.l.cTM, R.l.cSk, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3014932824064L, 22463);
              MsgRetransmitUI.a(MsgRetransmitUI.this, MsgRetransmitUI.this.getIntent(), localObject1);
              GMTrace.o(3014932824064L, 22463);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
            {
              GMTrace.i(3045266030592L, 22689);
              MsgRetransmitUI.this.finish();
              GMTrace.o(3045266030592L, 22689);
            }
          });
          GMTrace.o(3027280855040L, 22555);
          return;
        }
        l(getIntent(), (String)localObject1);
        GMTrace.o(3027280855040L, 22555);
        return;
      }
      bi((String)localObject1, true);
      GMTrace.o(3027280855040L, 22555);
      return;
    }
    switch (this.msgType)
    {
    default: 
      GMTrace.o(3027280855040L, 22555);
      return;
    }
    this.xkG.get(0);
    final Object localObject1 = getIntent().getExtras().getString("_mmessage_appPackage");
    Object localObject3 = new com.tencent.mm.pluginsdk.model.app.f();
    ((com.tencent.mm.pluginsdk.model.app.f)localObject3).field_packageName = ((String)localObject1);
    an.aWy().b((com.tencent.mm.sdk.e.c)localObject3, new String[] { "packageName" });
    Object localObject5 = new SendMessageToWX.Req(getIntent().getExtras()).message;
    Object localObject4 = new c(new c.a()
    {
      public final void ciG()
      {
        GMTrace.i(3018154049536L, 22487);
        MsgRetransmitUI.this.finish();
        GMTrace.o(3018154049536L, 22487);
      }
    });
    if (((WXMediaMessage)localObject5).thumbData == null) {}
    for (localObject1 = null;; localObject1 = com.tencent.mm.sdk.platformtools.d.bg(((WXMediaMessage)localObject5).thumbData)) {
      switch (((WXMediaMessage)localObject5).mediaObject.type())
      {
      default: 
        w.e("MicroMsg.SendAppMessage", "unkown app message type, skipped, type=" + ((WXMediaMessage)localObject5).mediaObject.type());
        GMTrace.o(3027280855040L, 22555);
        return;
      }
    }
    localObject1 = View.inflate(this, R.i.cps, null);
    ((TextView)((View)localObject1).findViewById(R.h.chT)).setText(((WXMediaMessage)localObject5).title);
    for (;;)
    {
      ((TextView)((View)localObject1).findViewById(R.h.cfB)).setText(com.tencent.mm.pluginsdk.model.app.g.a(this, (com.tencent.mm.pluginsdk.model.app.f)localObject3, null));
      ((c)localObject4).oaD = com.tencent.mm.ui.base.h.a(this, null, (View)localObject1, getString(R.l.cUs), getString(R.l.cSk), new c.1((c)localObject4), new c.2((c)localObject4));
      break;
      View localView = View.inflate(this, R.i.cpr, null);
      ((ImageView)localView.findViewById(R.h.che)).setImageBitmap((Bitmap)localObject1);
      ((TextView)localView.findViewById(R.h.chT)).setText(((WXMediaMessage)localObject5).title);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, R.i.cpq, null);
      ((ImageView)localView.findViewById(R.h.che)).setImageBitmap((Bitmap)localObject1);
      localObject1 = (TextView)localView.findViewById(R.h.chT);
      localObject6 = (TextView)localView.findViewById(R.h.bti);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject6).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, R.i.cpq, null);
      ((ImageView)localView.findViewById(R.h.che)).setImageBitmap((Bitmap)localObject1);
      localObject1 = (TextView)localView.findViewById(R.h.chT);
      localObject6 = (TextView)localView.findViewById(R.h.bti);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject6).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, R.i.cpq, null);
      ((ImageView)localView.findViewById(R.h.che)).setImageBitmap((Bitmap)localObject1);
      localObject1 = (TextView)localView.findViewById(R.h.chT);
      localObject6 = (TextView)localView.findViewById(R.h.bti);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject6).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, R.i.cpq, null);
      ((ImageView)localView.findViewById(R.h.che)).setImageBitmap((Bitmap)localObject1);
      localObject1 = (TextView)localView.findViewById(R.h.chT);
      localObject6 = (TextView)localView.findViewById(R.h.bti);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject6).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
      continue;
      localView = View.inflate(this, R.i.cpq, null);
      ((ImageView)localView.findViewById(R.h.che)).setImageBitmap((Bitmap)localObject1);
      localObject1 = (TextView)localView.findViewById(R.h.chT);
      localObject6 = (TextView)localView.findViewById(R.h.bti);
      ((TextView)localObject1).setText(((WXMediaMessage)localObject5).title);
      ((TextView)localObject6).setText(((WXMediaMessage)localObject5).description);
      localObject1 = localView;
    }
  }
  
  private boolean ciF()
  {
    GMTrace.i(3027951943680L, 22560);
    at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      w.e("MicroMsg.MsgRetransmitUI", "sdcard is not available, type = " + this.msgType);
      u.fo(this);
      GMTrace.o(3027951943680L, 22560);
      return false;
    }
    GMTrace.o(3027951943680L, 22560);
    return true;
  }
  
  private void l(Intent paramIntent, String paramString)
  {
    GMTrace.i(3028086161408L, 22561);
    if (this.xkS)
    {
      this.xkR = this.xkP.size();
      paramIntent = paramIntent.getExtras().getParcelableArrayList("android.intent.extra.STREAM");
      if ((paramIntent != null) && (paramIntent.size() > 0))
      {
        paramIntent = paramIntent.iterator();
        while (paramIntent.hasNext())
        {
          paramIntent.next();
          if (this.xle) {
            break;
          }
          Xc(paramString);
        }
        GMTrace.o(3028086161408L, 22561);
        return;
      }
      finish();
      GMTrace.o(3028086161408L, 22561);
      return;
    }
    this.xkR = 1;
    Xc(paramString);
    GMTrace.o(3028086161408L, 22561);
  }
  
  @bj
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(3028891467776L, 22567);
    if ((paramk.getType() != 110) || (!(paramk instanceof com.tencent.mm.ao.k)))
    {
      GMTrace.o(3028891467776L, 22567);
      return;
    }
    paramString = (com.tencent.mm.ao.k)paramk;
    Object localObject;
    if (getIntent().getBooleanExtra("Retr_FromMainTimeline", false))
    {
      paramk = getIntent().getStringExtra("Retr_KSnsId");
      if (!s.eb(paramString.eTy)) {
        break label201;
      }
      localObject = new pl();
      ((pl)localObject).eUl.eUg = paramk;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    while ((this.xkP != null) && (this.xkP.size() > 1))
    {
      if ((paramInt1 != 0) || (paramInt2 != 0)) {
        Toast.makeText(this, getString(R.l.dJq, new Object[] { this.xkP.get(0) }), 1).show();
      }
      this.xkP.remove(0);
      a(paramString.eTy, 3, this.gIl);
      GMTrace.o(3028891467776L, 22567);
      return;
      label201:
      localObject = new pm();
      ((pm)localObject).eUm.eUg = paramk;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    if (this.xkK != null)
    {
      this.xkK.dismiss();
      this.xkK = null;
    }
    this.xkY -= 1;
    if ((this.xkY <= 0) || (!this.xkX))
    {
      this.xkO = false;
      at.wS().b(110, this);
      if (this.xkM != 0)
      {
        if ((this.xkI) && (!this.xkW))
        {
          paramk = new Intent(this, En_5b8fbb1e.class);
          paramk.addFlags(67108864);
          paramk.putExtra("Chat_User", paramString.eTy);
          startActivity(paramk);
        }
        finish();
      }
    }
    GMTrace.o(3028891467776L, 22567);
  }
  
  public void finish()
  {
    GMTrace.i(3027012419584L, 22553);
    super.finish();
    overridePendingTransition(0, 0);
    GMTrace.o(3027012419584L, 22553);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(3027415072768L, 22556);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      Object localObject = f.a.eS(bg.Sx(this.eQH));
      if ((localObject != null) && (((f.a)localObject).type == 5) && (((f.a)localObject).url != null))
      {
        w.d("MicroMsg.MsgRetransmitUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), ((f.a)localObject).url, Long.valueOf(this.startTime), Integer.valueOf(this.xkZ), Integer.valueOf(1), Integer.valueOf(3) });
        paramIntent = "";
        try
        {
          localObject = URLEncoder.encode(((f.a)localObject).url, "UTF-8");
          paramIntent = (Intent)localObject;
        }
        catch (UnsupportedEncodingException localUnsupportedEncodingException)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.MsgRetransmitUI", localUnsupportedEncodingException, "", new Object[0]);
          }
        }
        com.tencent.mm.plugin.report.service.g.ork.i(13378, new Object[] { paramIntent, Long.valueOf(this.startTime), Integer.valueOf(this.xkZ), Integer.valueOf(1), Integer.valueOf(3) });
      }
      while ((localUnsupportedEncodingException == null) || (localUnsupportedEncodingException.type != 33))
      {
        finish();
        GMTrace.o(3027415072768L, 22556);
        return;
      }
      paramIntent = new com.tencent.mm.g.a.n();
      paramIntent.eAt.scene = this.xlc;
      if (2 == this.xlc) {}
      for (paramIntent.eAt.eAv = (this.xlb + ":" + this.xla);; paramIntent.eAt.eAv = this.xlb)
      {
        paramIntent.eAt.eAu = (localUnsupportedEncodingException.gkY + 1);
        paramIntent.eAt.eAw = localUnsupportedEncodingException.gkQ;
        paramIntent.eAt.eAr = localUnsupportedEncodingException.gkR;
        paramIntent.eAt.appId = localUnsupportedEncodingException.gkS;
        paramIntent.eAt.action = 1;
        paramIntent.eAt.eAx = "";
        paramIntent.eAt.eAy = bg.Pu();
        paramIntent.eAt.eAz = 3;
        com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
        break;
      }
    }
    if (paramInt1 != 0)
    {
      w.e("MicroMsg.MsgRetransmitUI", "onActivityResult, unknown requestCode = " + paramInt1);
      GMTrace.o(3027415072768L, 22556);
      return;
    }
    this.xkG = bg.g(paramIntent.getStringExtra("Select_Conv_User").split(","));
    String str1 = paramIntent.getStringExtra("custom_send_text");
    this.txk = paramIntent.getBooleanExtra("key_is_biz_chat", false);
    if (this.txk) {
      this.juT = paramIntent.getLongExtra("key_biz_chat_id", -1L);
    }
    paramInt1 = paramIntent.getIntExtra("Retr_Msg_Type", -1);
    if (paramInt1 != -1)
    {
      w.i("MicroMsg.MsgRetransmitUI", "summerbig replace msgType %d->%d", new Object[] { Integer.valueOf(this.msgType), Integer.valueOf(paramInt1) });
      this.msgType = paramInt1;
    }
    w.i("MicroMsg.MsgRetransmitUI", "summersafecdn onActivityResult doRetransmit msgType[%d], iScene[%d], size[%d]", new Object[] { Integer.valueOf(this.msgType), Integer.valueOf(this.xkM), Integer.valueOf(this.xkG.size()) });
    ciE();
    if (!TextUtils.isEmpty(str1))
    {
      paramIntent = this.xkG.iterator();
      while (paramIntent.hasNext())
      {
        String str2 = (String)paramIntent.next();
        ol localol = new ol();
        localol.eTx.eTy = str2;
        localol.eTx.content = str1;
        localol.eTx.type = s.go(str2);
        localol.eTx.flags = 0;
        com.tencent.mm.sdk.b.a.vgX.m(localol);
      }
    }
    GMTrace.o(3027415072768L, 22556);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(3026878201856L, 22552);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    ad.a(getWindow());
    w.i("MicroMsg.MsgRetransmitUI", "on activity create");
    this.startTime = bg.Pu();
    this.msgType = getIntent().getIntExtra("Retr_Msg_Type", -1);
    this.eQH = getIntent().getStringExtra("Retr_Msg_content");
    this.eDr = getIntent().getLongExtra("Retr_Msg_Id", -1L);
    this.euR = getIntent().getStringExtra("Retr_File_Name");
    this.xkP = getIntent().getStringArrayListExtra("Retr_File_Path_List");
    boolean bool;
    if ((this.xkP != null) && (this.xkP.size() > 0))
    {
      bool = true;
      this.xkS = bool;
      this.gGV = getIntent().getIntExtra("Retr_Compress_Type", 0);
      this.xkM = getIntent().getIntExtra("Retr_Scene", 0);
      this.length = getIntent().getIntExtra("Retr_length", 0);
      this.xkL = getIntent().getIntExtra("Retr_video_isexport", 0);
      this.xkH = getIntent().getStringExtra("Retr_Msg_thumb_path");
      this.xkI = getIntent().getBooleanExtra("Retr_go_to_chattingUI", true);
      this.xkW = getIntent().getBooleanExtra("Retr_start_where_you_are", true);
      paramBundle = getIntent();
      if (this.xkM != 0) {
        break label742;
      }
      bool = true;
      label260:
      this.xkX = paramBundle.getBooleanExtra("Multi_Retr", bool);
      if (this.xkX) {
        this.xkW = true;
      }
      this.xkJ = getIntent().getBooleanExtra("Retr_show_success_tips", this.xkW);
      this.xkT = getIntent().getBooleanExtra("Edit_Mode_Sigle_Msg", false);
      this.wqc = getIntent().getBooleanExtra("is_group_chat", false);
      this.wwx = getIntent().getIntExtra("Retr_Biz_Msg_Selected_Msg_Index", -1);
      this.eIy = getIntent().getStringExtra("Retr_NewYear_Thumb_Path");
      this.xkU = getIntent().getIntExtra("Retr_MsgImgScene", 0);
      this.gIN = getIntent().getFloatExtra("Retr_Longtitude", -1000.0F);
      this.eMl = getIntent().getFloatExtra("Retr_Latitude", -1000.0F);
      this.gIO = getIntent().getStringExtra("Retr_AttachedContent");
      this.xkV = "gallery".equals(getIntent().getStringExtra("Retr_From"));
      this.hNz = getIntent().getStringExtra("reportSessionId");
      this.xkZ = getIntent().getIntExtra("Retr_MsgFromScene", 0);
      this.xla = getIntent().getStringExtra("Retr_MsgFromUserName");
      this.xlb = getIntent().getStringExtra("Retr_MsgTalker");
      this.xlc = getIntent().getIntExtra("Retr_MsgAppBrandFromScene", 1);
      at.wS().a(110, this);
      if (!com.tencent.mm.compatible.util.d.et(19)) {
        setContentView(R.i.cqp);
      }
      paramBundle = new Intent(this, SelectConversationUI.class);
      paramBundle.putExtra("scene", 8);
      paramBundle.putExtra("select_is_ret", true);
      if (this.xkX) {
        paramBundle.putExtra("mutil_select_is_ret", true);
      }
      switch (this.msgType)
      {
      case 3: 
      case 4: 
      case 5: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      default: 
        paramBundle.putExtra("Select_Conv_Type", 3);
      }
    }
    for (;;)
    {
      paramBundle.putExtra("Retr_Msg_Type", this.msgType);
      paramBundle.putExtra("Retr_Msg_Id", this.eDr);
      paramBundle.putExtra("Retr_Msg_content", this.eQH);
      paramBundle.putExtra("image_path", this.euR);
      startActivityForResult(paramBundle, 0);
      GMTrace.o(3026878201856L, 22552);
      return;
      bool = false;
      break;
      label742:
      bool = false;
      break label260;
      paramBundle.putExtra("appbrand_params", getIntent().getSerializableExtra("appbrand_params"));
      if (this.xkZ == 3) {
        paramBundle.putExtra("scene_from", 3);
      }
      paramBundle.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.wwx);
      paramBundle.putExtra("Retr_Big_File", getIntent().getBooleanExtra("Retr_Big_File", false));
      paramBundle.putExtra("Select_Conv_Type", 3);
      continue;
      paramBundle.putExtra("Select_Conv_Type", 11);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(3027146637312L, 22554);
    if (!this.xkO) {
      at.wS().b(110, this);
    }
    super.onDestroy();
    GMTrace.o(3027146637312L, 22554);
  }
  
  public static final class a
    extends AsyncTask<Object, Object, String>
  {
    public Context context;
    public String eTv;
    public String euR;
    public String fwv;
    public int haG;
    public int hcv;
    public Dialog hul;
    private ae mHandler;
    public String userName;
    public boolean xkJ;
    public int xkL;
    public boolean xll;
    public String xlm;
    public boolean xln;
    public boolean xlo;
    public boolean xlp;
    public bhr xlq;
    public MsgRetransmitUI.b xlr;
    
    public a()
    {
      GMTrace.i(3044729159680L, 22685);
      this.xln = true;
      this.xlo = false;
      this.xkJ = false;
      this.xlp = true;
      this.xlq = null;
      this.xlr = null;
      this.mHandler = new ae();
      GMTrace.o(3044729159680L, 22685);
    }
  }
  
  private static final class b
  {
    boolean eDb;
    public List<String> xlt;
    
    public b()
    {
      GMTrace.i(3012919558144L, 22448);
      this.xlt = null;
      this.eDb = true;
      GMTrace.o(3012919558144L, 22448);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\transmit\MsgRetransmitUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */