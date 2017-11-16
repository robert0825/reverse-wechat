package com.tencent.mm.af;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ac.c;
import com.tencent.mm.ac.i;
import com.tencent.mm.g.b.af;
import com.tencent.mm.kernel.b;
import com.tencent.mm.protocal.c.gx;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  public a()
  {
    GMTrace.i(4542330568704L, 33843);
    GMTrace.o(4542330568704L, 33843);
  }
  
  public static boolean Ew()
  {
    GMTrace.i(4542599004160L, 33845);
    Object localObject = com.tencent.mm.kernel.h.xy().xh().get(w.a.vrM, null);
    if ((localObject == null) || (!(localObject instanceof Integer))) {
      w.i("MicroMsg.BizAttrRenovator", "openFlag is null.");
    }
    for (int i = 1;; i = ((Integer)localObject).intValue())
    {
      w.i("MicroMsg.BizAttrRenovator", "openFlag is %d.", new Object[] { Integer.valueOf(i) });
      if (i != 1) {
        break;
      }
      GMTrace.o(4542599004160L, 33845);
      return true;
    }
    GMTrace.o(4542599004160L, 33845);
    return false;
  }
  
  public static boolean a(com.tencent.mm.storage.x paramx, d paramd, List<gx> paramList)
  {
    GMTrace.i(4542867439616L, 33847);
    if ((paramx == null) || (paramList == null) || (paramList.size() == 0))
    {
      w.e("MicroMsg.BizAttrRenovator", "updateBizAttributes failed.");
      GMTrace.o(4542867439616L, 33847);
      return false;
    }
    String str1 = paramx.field_username;
    if (!paramx.bSA())
    {
      w.w("MicroMsg.BizAttrRenovator", "updateBizAttributes failed, contact is not a biz contact.(username : %s)", new Object[] { str1 });
      GMTrace.o(4542867439616L, 33847);
      return false;
    }
    d locald = paramd;
    if (paramd == null) {
      locald = x.FG().iC(str1);
    }
    if (locald == null)
    {
      w.i("MicroMsg.BizAttrRenovator", "BizInfo is null.(username : %s)", new Object[] { str1 });
      GMTrace.o(4542867439616L, 33847);
      return false;
    }
    com.tencent.mm.ac.h localh = com.tencent.mm.ac.n.Di().ig(str1);
    long l1;
    int i;
    int k;
    gx localgx;
    try
    {
      if (bg.nm(locald.field_extInfo)) {}
      for (paramd = new JSONObject();; paramd = new JSONObject(locald.field_extInfo))
      {
        l1 = -1L;
        l2 = paramx.field_type;
        paramList = paramList.iterator();
        i = 0;
        k = 0;
        for (;;)
        {
          if (!paramList.hasNext()) {
            break label747;
          }
          localgx = (gx)paramList.next();
          if (localgx != null) {
            break;
          }
          w.w("MicroMsg.BizAttrRenovator", "keyValue is null.");
        }
      }
    }
    catch (Exception paramd)
    {
      String str2;
      for (;;)
      {
        w.e("MicroMsg.BizAttrRenovator", "create Json object from extInfo error. %s.", new Object[] { paramd });
        paramd = new JSONObject();
        continue;
        str2 = localgx.tVN;
        w.i("MicroMsg.BizAttrRenovator", "[BizAttr] UpdateInfoList key = %s, value = %s", new Object[] { str2, localgx.oqQ });
        String str3 = localgx.oqQ;
        if (!"UserName".equals(str2))
        {
          if ("NickName".equals(str2)) {
            paramx.cl(str3);
          }
        }
        else
        {
          label324:
          j = 1;
          label327:
          if ((j == 0) && (!b(paramd, str2, localgx.oqQ)))
          {
            str3 = localgx.oqQ;
            if (!"BrandInfo".equals(str2)) {
              break label512;
            }
            locald.field_brandInfo = str3;
            label370:
            j = 1;
          }
        }
        for (;;)
        {
          if (j == 0) {
            break label607;
          }
          i += 1;
          break;
          if ("Alias".equals(str2))
          {
            paramx.ci(str3);
            break label324;
          }
          if ("PYInitial".equals(str2))
          {
            paramx.cm(str3);
            break label324;
          }
          if ("QuanPin".equals(str2))
          {
            paramx.cn(str3);
            break label324;
          }
          if ("VerifyFlag".equals(str2))
          {
            paramx.dk(bg.getInt(str3, paramx.field_verifyFlag));
            break label324;
          }
          if ("VerifyInfo".equals(str2))
          {
            paramx.cD(str3);
            break label324;
          }
          if ("Signature".equals(str2))
          {
            paramx.cy(str3);
            break label324;
          }
          j = 0;
          break label327;
          label512:
          if ("BrandIconURL".equals(str2))
          {
            locald.field_brandIconURL = str3;
            break label370;
          }
          if ("BrandFlag".equals(str2))
          {
            locald.field_brandFlag = bg.getInt(str3, locald.field_brandFlag);
            break label370;
          }
          if ("Appid".equals(str2))
          {
            if (str3.equals(locald.field_appId))
            {
              j = 0;
              continue;
            }
            locald.field_appId = str3;
            break label370;
          }
          j = 0;
        }
        label607:
        str3 = localgx.oqQ;
        if ("BigHeadImgUrl".equals(str2)) {
          if (localh != null) {
            localh.gsU = str3;
          }
        }
        label637:
        for (int j = 1;; j = 0)
        {
          if (j == 0) {
            break label687;
          }
          i += 1;
          k = 1;
          break;
          if ("SmallHeadImgUrl".equals(str2))
          {
            if (localh == null) {
              break label637;
            }
            localh.gsT = str3;
            break label637;
          }
        }
        label687:
        if (!"BitMask".equals(str2)) {
          break;
        }
        l1 = bg.getLong(localgx.oqQ, l1);
        i += 1;
      }
      if (!"BitVal".equals(str2)) {
        break label958;
      }
    }
    long l2 = bg.getLong(localgx.oqQ, l2);
    i += 1;
    label747:
    label958:
    for (;;)
    {
      break;
      if (i == 0)
      {
        w.i("MicroMsg.BizAttrRenovator", "None attribute has been updated.");
        GMTrace.o(4542867439616L, 33847);
        return false;
      }
      locald.field_extInfo = paramd.toString();
      if ((localh != null) && (k != 0))
      {
        com.tencent.mm.ac.n.Di().a(localh);
        com.tencent.mm.ac.n.Dh();
        com.tencent.mm.ac.d.u(str1, false);
        com.tencent.mm.ac.n.Dh();
        com.tencent.mm.ac.d.u(str1, true);
        com.tencent.mm.ac.n.Dv().hS(str1);
        paramd = x.FO();
        if (!bg.nm(str1))
        {
          w.d("MicroMsg.BrandLogic", "remove cache by brandKey : %s", new Object[] { str1 });
          paramd = (WeakReference)paramd.gxu.remove(str1);
          if (paramd != null)
          {
            paramd = (Bitmap)paramd.get();
            if (paramd != null) {
              paramd.isRecycled();
            }
          }
        }
      }
      paramx.setType(paramx.field_type | (int)(l1 & l2));
      ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().a(str1, paramx);
      x.FG().e(locald);
      w.i("MicroMsg.BizAttrRenovator", "Update bizInfo attributes successfully.");
      GMTrace.o(4542867439616L, 33847);
      return true;
    }
  }
  
  static boolean b(d paramd)
  {
    GMTrace.i(4542464786432L, 33844);
    if (paramd == null)
    {
      w.i("MicroMsg.BizAttrRenovator", "BizInfo is null.");
      GMTrace.o(4542464786432L, 33844);
      return false;
    }
    if (!Ew())
    {
      GMTrace.o(4542464786432L, 33844);
      return false;
    }
    int j = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.zero.b.a.class)).ut().getInt("MMBizAttrSyncFreq", -1);
    int i = j;
    if (j == -1)
    {
      w.i("MicroMsg.BizAttrRenovator", "MMBizAttrSyncFreq is null.");
      i = 3600;
    }
    long l1 = System.currentTimeMillis();
    long l2 = paramd.field_incrementUpdateTime;
    w.i("MicroMsg.BizAttrRenovator", "currentMS(%d), lastUpdateTime(%d), freq(%d), version(%s).", new Object[] { Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(i), paramd.field_attrSyncVersion });
    if (l1 - l2 >= i * 1000L)
    {
      GMTrace.o(4542464786432L, 33844);
      return true;
    }
    GMTrace.o(4542464786432L, 33844);
    return false;
  }
  
  private static boolean b(JSONObject paramJSONObject, String paramString1, String paramString2)
  {
    GMTrace.i(4543001657344L, 33848);
    try
    {
      if ("IsShowHeadImgInMsg".equals(paramString1)) {
        paramJSONObject.put(paramString1, paramString2);
      }
      for (;;)
      {
        GMTrace.o(4543001657344L, 33848);
        return true;
        if (!"IsHideInputToolbarInMsg".equals(paramString1)) {
          break;
        }
        paramJSONObject.put(paramString1, paramString2);
      }
    }
    catch (JSONException paramJSONObject)
    {
      for (;;)
      {
        w.e("MicroMsg.BizAttrRenovator", "updateExtInfoAttrs failed, key(%s) value(%s), exception : %s.", new Object[] { paramString1, paramString2, paramJSONObject });
        continue;
        if (!"IsAgreeProtocol".equals(paramString1)) {
          if ("InteractiveMode".equals(paramString1)) {
            paramJSONObject.put(paramString1, bg.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          } else if ("CanReceiveSpeexVoice".equals(paramString1)) {
            paramJSONObject.put(paramString1, paramString2);
          } else if ("ConnectorMsgType".equals(paramString1)) {
            paramJSONObject.put(paramString1, bg.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          } else if ("ReportLocationType".equals(paramString1)) {
            paramJSONObject.put(paramString1, bg.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          } else if ("AudioPlayType".equals(paramString1)) {
            paramJSONObject.put(paramString1, bg.getInt(paramString2, paramJSONObject.optInt(paramString1)));
          } else if ("IsShowMember".equals(paramString1)) {
            paramJSONObject.put(paramString1, paramString2);
          } else if ("ConferenceContactExpireTime".equals(paramString1)) {
            paramJSONObject.put(paramString1, paramString2);
          } else if (!"VerifyMsg2Remark".equals(paramString1)) {
            if ("VerifyContactPromptTitle".equals(paramString1)) {
              paramJSONObject.put(paramString1, paramString2);
            } else if (!"IsSubscribeStat".equals(paramString1)) {
              if ("ScanQRCodeType".equals(paramString1)) {
                paramJSONObject.put(paramString1, bg.getInt(paramString2, paramJSONObject.optInt(paramString1)));
              } else if ("ServiceType".equals(paramString1)) {
                paramJSONObject.put(paramString1, bg.getInt(paramString2, paramJSONObject.optInt(paramString1)));
              } else if (!"NeedShowUserAddrObtaining".equals(paramString1)) {
                if ("SupportEmoticonLinkPrefix".equals(paramString1)) {
                  paramJSONObject.put(paramString1, paramString2);
                } else if ("FunctionFlag".equals(paramString1)) {
                  paramJSONObject.put(paramString1, bg.getInt(paramString2, paramJSONObject.optInt(paramString1)));
                } else if ("NotifyManage".equals(paramString1)) {
                  paramJSONObject.put(paramString1, paramString2);
                } else if ("ServicePhone".equals(paramString1)) {
                  paramJSONObject.put(paramString1, paramString2);
                } else if ("IsTrademarkProtection".equals(paramString1)) {
                  paramJSONObject.put(paramString1, paramString2);
                } else if (!"CanReceiveLongVideo".equals(paramString1)) {
                  if ("TrademarkUrl".equals(paramString1)) {
                    paramJSONObject.put(paramString1, paramString2);
                  } else if ("TrademarkName".equals(paramString1)) {
                    paramJSONObject.put(paramString1, paramString2);
                  } else if ("MMBizMenu".equals(paramString1)) {
                    paramJSONObject.put(paramString1, paramString2);
                  } else if ("VerifySource".equals(paramString1)) {
                    paramJSONObject.put(paramString1, paramString2);
                  } else if (!"MMBizTabbar".equals(paramString1)) {
                    if ("PayShowInfo".equals(paramString1)) {
                      paramJSONObject.put(paramString1, paramString2);
                    } else if ("HardwareBizInfo".equals(paramString1)) {
                      paramJSONObject.put(paramString1, paramString2);
                    } else if ("EnterpriseBizInfo".equals(paramString1)) {
                      paramJSONObject.put(paramString1, paramString2);
                    } else if (!"MainPage".equals(paramString1)) {
                      if ("RegisterSource".equals(paramString1)) {
                        paramJSONObject.put(paramString1, paramString2);
                      } else if (!"IBeaconBizInfo".equals(paramString1)) {
                        if ("WxaAppInfo".equals(paramString1))
                        {
                          paramJSONObject.put(paramString1, paramString2);
                        }
                        else if ("WxaAppVersionInfo".equals(paramString1))
                        {
                          paramJSONObject.put(paramString1, paramString2);
                        }
                        else if ("WXAppType".equals(paramString1))
                        {
                          paramJSONObject.put(paramString1, paramString2);
                        }
                        else
                        {
                          if (!"BindWxaInfo".equals(paramString1)) {
                            break;
                          }
                          paramJSONObject.put(paramString1, paramString2);
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      GMTrace.o(4543001657344L, 33848);
    }
    return false;
  }
  
  public final boolean ip(final String paramString)
  {
    GMTrace.i(18486344548352L, 137734);
    if (bg.nm(paramString))
    {
      w.i("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes failed, username is null or nil.");
      GMTrace.o(18486344548352L, 137734);
      return false;
    }
    w.d("MicroMsg.BizAttrRenovator", "try2UpdateBizAttributes");
    d locald = x.FG().iC(paramString);
    if (!b(locald))
    {
      w.i("MicroMsg.BizAttrRenovator", "do not need to update biz attrs now.");
      GMTrace.o(18486344548352L, 137734);
      return false;
    }
    final WeakReference localWeakReference = new WeakReference(null);
    com.tencent.mm.kernel.h.xx().fYr.a(new p(paramString, locald.field_attrSyncVersion, new p.a() {}), 0);
    GMTrace.o(18486344548352L, 137734);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */