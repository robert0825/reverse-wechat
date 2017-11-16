package com.tencent.mm.plugin.webview.ui.tools.widget;

import com.tencent.mm.ui.widget.*;
import android.app.*;
import com.tencent.gmtrace.*;
import java.util.concurrent.*;
import com.tencent.mm.protocal.*;
import com.tencent.mm.plugin.webview.model.*;
import com.tencent.mm.plugin.webview.*;
import java.util.*;
import com.tencent.mm.plugin.webview.modelcache.*;
import com.tencent.xweb.*;
import android.net.http.*;
import android.graphics.*;
import com.tencent.mm.sdk.platformtools.*;
import android.webkit.*;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.*;
import android.net.*;
import java.util.regex.*;
import android.content.*;
import android.os.*;
import com.tencent.mm.plugin.webview.stub.*;

public class e extends n
{
    public MMWebView inX;
    private Set<String> lJF;
    public String lJH;
    public String lJI;
    private String lJM;
    public boolean lJO;
    public ae mHandler;
    protected Activity nJy;
    private final Map<String, Map<String, String>> rLN;
    public d rQv;
    public com.tencent.mm.plugin.webview.ui.tools.jsapi.d rQw;
    private f rQz;
    public com.tencent.mm.plugin.webview.ui.tools.e rSb;
    protected b rVo;
    public a rVp;
    public String rVq;
    private String rVr;
    private List<com.tencent.mm.plugin.webview.ui.tools.jsapi.b> rVs;
    private final Map<String, String> rVt;
    public boolean rVu;
    public boolean rVv;
    public Map<String, String> rVw;
    public c rVx;
    public g rVy;
    
    public e() {
        GMTrace.i(12097983348736L, 90137);
        this.rQz = null;
        this.rQw = null;
        this.lJO = false;
        this.lJM = "";
        this.lJF = new HashSet<String>();
        this.rVo = new b();
        this.rVp = new a(null);
        this.rVq = null;
        this.lJH = null;
        this.rVr = null;
        this.rVs = new ArrayList<com.tencent.mm.plugin.webview.ui.tools.jsapi.b>();
        this.rVt = new HashMap<String, String>();
        this.rLN = new ConcurrentHashMap<String, Map<String, String>>();
        this.rVu = false;
        this.rVv = false;
        this.rVx = new c();
        this.rVy = new g() {
            private g rVA;
            
            {
                GMTrace.i(18166235267072L, 135349);
                this.rVA = new g();
                GMTrace.o(18166235267072L, 135349);
            }
            
            private g bFS() {
                GMTrace.i(18166369484800L, 135350);
                final g xz = e.this.XZ();
                if (xz == null) {
                    final g rva = this.rVA;
                    GMTrace.o(18166369484800L, 135350);
                    return rva;
                }
                GMTrace.o(18166369484800L, 135350);
                return xz;
            }
            
            @Override
            public final void LF(final String s) {
                GMTrace.i(18168114315264L, 135363);
                this.bFS().LF(s);
                GMTrace.o(18168114315264L, 135363);
            }
            
            @Override
            public final void Q(final Bundle bundle) {
                GMTrace.i(18167980097536L, 135362);
                this.bFS().Q(bundle);
                GMTrace.o(18167980097536L, 135362);
            }
            
            @Override
            public final void R(final Bundle bundle) {
                GMTrace.i(18168785403904L, 135368);
                this.bFS().R(bundle);
                GMTrace.o(18168785403904L, 135368);
            }
            
            @Override
            public final String Zi() {
                GMTrace.i(18167174791168L, 135356);
                final String aEr = e.this.aEr();
                GMTrace.o(18167174791168L, 135356);
                return aEr;
            }
            
            @Override
            public final boolean a(final com.tencent.mm.plugin.webview.stub.c c) {
                GMTrace.i(18166772137984L, 135353);
                if (e.this.inX == null) {
                    GMTrace.o(18166772137984L, 135353);
                    return true;
                }
                w.i("MicroMsg.MMWebViewClient", "onSceneEnd, instance hashcode = " + e.this.inX.hashCode());
                e.this.mHandler.post((Runnable)new Runnable() {
                    final /* synthetic */ com.tencent.mm.plugin.webview.stub.c rMU;
                    
                    {
                        GMTrace.i(18165966831616L, 135347);
                        GMTrace.o(18165966831616L, 135347);
                    }
                    
                    @Override
                    public final void run() {
                        GMTrace.i(18166101049344L, 135348);
                        try {
                            e.this.a(this.rMU);
                            GMTrace.o(18166101049344L, 135348);
                        }
                        catch (Exception ex) {
                            w.e("MicroMsg.MMWebViewClient", ex.getMessage());
                            GMTrace.o(18166101049344L, 135348);
                        }
                    }
                });
                final boolean a = this.bFS().a(c);
                GMTrace.o(18166772137984L, 135353);
                return a;
            }
            
            @Override
            public final boolean a(final String s, final String s2, final Bundle bundle, final boolean b) {
                GMTrace.i(18166906355712L, 135354);
                if (e.this.rQw == null) {
                    GMTrace.o(18166906355712L, 135354);
                    return false;
                }
                e.this.mHandler.post((Runnable)new Runnable() {
                    final /* synthetic */ String iyk;
                    final /* synthetic */ String rHC;
                    final /* synthetic */ Bundle rHD;
                    final /* synthetic */ boolean rHE;
                    
                    {
                        GMTrace.i(18169859145728L, 135376);
                        GMTrace.o(18169859145728L, 135376);
                    }
                    
                    @Override
                    public final void run() {
                        GMTrace.i(18169993363456L, 135377);
                        e.this.rQw.a(this.rHC, this.iyk, i.ac(this.rHD), this.rHE);
                        GMTrace.o(18169993363456L, 135377);
                    }
                });
                this.bFS().a(s, s2, bundle, b);
                GMTrace.o(18166906355712L, 135354);
                return false;
            }
            
            @Override
            public final String bDg() {
                GMTrace.i(18167040573440L, 135355);
                final String rVq = e.this.rVq;
                GMTrace.o(18167040573440L, 135355);
                return rVq;
            }
            
            @Override
            public final String bDh() {
                GMTrace.i(18167309008896L, 135357);
                final String bDh = this.bFS().bDh();
                GMTrace.o(18167309008896L, 135357);
                return bDh;
            }
            
            @Override
            public final void bDi() {
                GMTrace.i(18167845879808L, 135361);
                if (e.this.rQw != null) {
                    e.this.rQw.bDi();
                }
                GMTrace.o(18167845879808L, 135361);
            }
            
            @Override
            public final void bDj() {
                GMTrace.i(18168382750720L, 135365);
                if (e.this.rQw != null) {
                    e.this.rQw.bDj();
                }
                GMTrace.o(18168382750720L, 135365);
            }
            
            @Override
            public final Bundle d(final int n, Bundle d) {
                GMTrace.i(18168651186176L, 135367);
                d = this.bFS().d(n, d);
                GMTrace.o(18168651186176L, 135367);
                return d;
            }
            
            @Override
            public final void e(final String s, final String s2, final int n, final int n2) {
                GMTrace.i(18168516968448L, 135366);
                this.bFS().e(s, s2, n, n2);
                GMTrace.o(18168516968448L, 135366);
            }
            
            @Override
            public final void ei(final String s, final String s2) {
                GMTrace.i(18168248532992L, 135364);
                this.bFS().ei(s, s2);
                GMTrace.o(18168248532992L, 135364);
            }
            
            @Override
            public final void ej(final String s, final String s2) {
                GMTrace.i(18169053839360L, 135370);
                this.bFS().ej(s, s2);
                GMTrace.o(18169053839360L, 135370);
            }
            
            @Override
            public final void jt(final boolean b) {
                GMTrace.i(18167443226624L, 135358);
                this.bFS().jt(b);
                GMTrace.o(18167443226624L, 135358);
            }
            
            @Override
            public final void ju(final boolean b) {
                GMTrace.i(18167577444352L, 135359);
                this.bFS().ju(b);
                GMTrace.o(18167577444352L, 135359);
            }
            
            @Override
            public final void jv(final boolean b) {
                GMTrace.i(18168919621632L, 135369);
                this.bFS().jv(b);
                GMTrace.o(18168919621632L, 135369);
            }
            
            @Override
            public final boolean m(final int n, final Bundle bundle) {
                GMTrace.i(18166637920256L, 135352);
                w.i("MicroMsg.MMWebViewClient", "callback, actionCode = " + n);
                switch (n) {
                    default: {
                        w.e("MicroMsg.MMWebViewClient", "undefine action code!!!");
                        break;
                    }
                    case 1002: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Bundle euy;
                            
                            {
                                GMTrace.i(18161806082048L, 135316);
                                GMTrace.o(18161806082048L, 135316);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18161940299776L, 135317);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.f(this.euy, "download_succ");
                                }
                                GMTrace.o(18161940299776L, 135317);
                            }
                        });
                        break;
                    }
                    case 1003: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Bundle euy;
                            
                            {
                                GMTrace.i(18164087783424L, 135333);
                                GMTrace.o(18164087783424L, 135333);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18164222001152L, 135334);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.f(this.euy, "download_fail");
                                }
                                GMTrace.o(18164222001152L, 135334);
                            }
                        });
                        break;
                    }
                    case 1008: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Bundle euy;
                            
                            {
                                GMTrace.i(18165429960704L, 135343);
                                GMTrace.o(18165429960704L, 135343);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18165564178432L, 135344);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.f(this.euy, "download_removed");
                                }
                                GMTrace.o(18165564178432L, 135344);
                            }
                        });
                        break;
                    }
                    case 1007: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ String eud;
                            final /* synthetic */ int jVs;
                            final /* synthetic */ long rNa;
                            
                            {
                                GMTrace.i(18169322274816L, 135372);
                                GMTrace.o(18169322274816L, 135372);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18169456492544L, 135373);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.g(this.eud, this.rNa, this.jVs);
                                }
                                GMTrace.o(18169456492544L, 135373);
                            }
                        });
                        break;
                    }
                    case 2003: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ int rNg;
                            final /* synthetic */ String rNh;
                            
                            {
                                GMTrace.i(18170396016640L, 135380);
                                GMTrace.o(18170396016640L, 135380);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18170530234368L, 135381);
                                if (e.this.rQw != null) {
                                    e.this.rQw.co(this.rNh, this.rNg);
                                }
                                GMTrace.o(18170530234368L, 135381);
                            }
                        });
                        break;
                    }
                    case 2004: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ int hsX;
                            final /* synthetic */ String rME;
                            
                            {
                                GMTrace.i(18170127581184L, 135378);
                                GMTrace.o(18170127581184L, 135378);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18170261798912L, 135379);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cp(this.rME, this.hsX);
                                }
                                GMTrace.o(18170261798912L, 135379);
                            }
                        });
                        break;
                    }
                    case 2005: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ int hsX;
                            final /* synthetic */ String ieu;
                            
                            {
                                GMTrace.i(18164624654336L, 135337);
                                GMTrace.o(18164624654336L, 135337);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18164758872064L, 135338);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cq(this.ieu, this.hsX);
                                }
                                GMTrace.o(18164758872064L, 135338);
                            }
                        });
                        break;
                    }
                    case 2006: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ int hsX;
                            final /* synthetic */ String rME;
                            
                            {
                                GMTrace.i(18165161525248L, 135341);
                                GMTrace.o(18165161525248L, 135341);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18165295742976L, 135342);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cr(this.rME, this.hsX);
                                }
                                GMTrace.o(18165295742976L, 135342);
                            }
                        });
                        break;
                    }
                    case 2010: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ int hsX;
                            final /* synthetic */ String ieu;
                            
                            {
                                GMTrace.i(18164356218880L, 135335);
                                GMTrace.o(18164356218880L, 135335);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18164490436608L, 135336);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cs(this.ieu, this.hsX);
                                }
                                GMTrace.o(18164490436608L, 135336);
                            }
                        });
                        break;
                    }
                    case 2002: {
                        final HashMap<String, String> hashMap = new HashMap<String, String>();
                        hashMap.put("err_msg", bundle.getString("playResult"));
                        hashMap.put("localId", bundle.getString("localId"));
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Map rMF;
                            
                            {
                                GMTrace.i(18161537646592L, 135314);
                                GMTrace.o(18161537646592L, 135314);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18161671864320L, 135315);
                                if (e.this.rQw != null) {
                                    e.this.rQw.Z(this.rMF);
                                }
                                GMTrace.o(18161671864320L, 135315);
                            }
                        });
                        break;
                    }
                    case 2008: {
                        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
                        hashMap2.put("localId", bundle.getString("localId"));
                        hashMap2.put("err_msg", bundle.getString("recordResult"));
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Map rMF;
                            
                            {
                                GMTrace.i(18170664452096L, 135382);
                                GMTrace.o(18170664452096L, 135382);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18170798669824L, 135383);
                                if (e.this.rQw != null) {
                                    e.this.rQw.aa(this.rMF);
                                }
                                GMTrace.o(18170798669824L, 135383);
                            }
                        });
                        break;
                    }
                    case 1006: {
                        if (e.this.rQw != null) {
                            e.this.mHandler.post((Runnable)new Runnable() {
                                final /* synthetic */ Bundle euy;
                                
                                {
                                    GMTrace.i(18163819347968L, 135331);
                                    GMTrace.o(18163819347968L, 135331);
                                }
                                
                                @Override
                                public final void run() {
                                    boolean b = false;
                                    GMTrace.i(18163953565696L, 135332);
                                    final byte[] byteArray = this.euy.getByteArray("jsapi_control_bytes");
                                    if (byteArray == null || e.this.rSb == null || e.this.rSb.bDM() == null) {
                                        final boolean b2 = byteArray != null;
                                        if (e.this.rSb != null) {
                                            b = true;
                                        }
                                        w.e("MicroMsg.MMWebViewClient", "has JSAPI_CONTROL_BYTES %b, has wvPerm %b", new Object[] { b2, b });
                                    }
                                    else {
                                        w.i("MicroMsg.MMWebViewClient", "update control bytes, %d", new Object[] { byteArray.length });
                                        e.this.rSb.bDM().tJT = byteArray;
                                    }
                                    if (e.this.rQw != null) {
                                        e.this.rQw.bFn();
                                    }
                                    GMTrace.o(18163953565696L, 135332);
                                }
                            });
                            break;
                        }
                        break;
                    }
                    case 90: {
                        if (e.this.rQw != null) {
                            e.this.mHandler.post((Runnable)new Runnable() {
                                final /* synthetic */ Bundle euy;
                                
                                {
                                    GMTrace.i(18165698396160L, 135345);
                                    GMTrace.o(18165698396160L, 135345);
                                }
                                
                                @Override
                                public final void run() {
                                    GMTrace.i(18165832613888L, 135346);
                                    if (e.this.rQw != null) {
                                        e.this.rQw.Mw(this.euy.getString("webview_network_type"));
                                    }
                                    GMTrace.o(18165832613888L, 135346);
                                }
                            });
                            break;
                        }
                        break;
                    }
                }
                this.bFS().m(n, bundle);
                GMTrace.o(18166637920256L, 135352);
                return true;
            }
            
            @Override
            public final void o(final int n, final Bundle bundle) {
                GMTrace.i(18167711662080L, 135360);
                this.bFS().o(n, bundle);
                GMTrace.o(18167711662080L, 135360);
            }
            
            @Override
            public final boolean xC(final int n) {
                GMTrace.i(18166503702528L, 135351);
                final boolean xc = this.bFS().xC(n);
                GMTrace.o(18166503702528L, 135351);
                return xc;
            }
        };
        GMTrace.o(12097983348736L, 90137);
    }
    
    public e(final MMWebView mmWebView) {
        this(mmWebView, false);
        GMTrace.i(12098117566464L, 90138);
        GMTrace.o(12098117566464L, 90138);
    }
    
    public e(final MMWebView inX, final boolean ljo) {
        GMTrace.i(12098251784192L, 90139);
        this.rQz = null;
        this.rQw = null;
        this.lJO = false;
        this.lJM = "";
        this.lJF = new HashSet<String>();
        this.rVo = new b();
        this.rVp = new a(null);
        this.rVq = null;
        this.lJH = null;
        this.rVr = null;
        this.rVs = new ArrayList<com.tencent.mm.plugin.webview.ui.tools.jsapi.b>();
        this.rVt = new HashMap<String, String>();
        this.rLN = new ConcurrentHashMap<String, Map<String, String>>();
        this.rVu = false;
        this.rVv = false;
        this.rVx = new c();
        this.rVy = new g() {
            private g rVA;
            
            {
                GMTrace.i(18166235267072L, 135349);
                this.rVA = new g();
                GMTrace.o(18166235267072L, 135349);
            }
            
            private g bFS() {
                GMTrace.i(18166369484800L, 135350);
                final g xz = e.this.XZ();
                if (xz == null) {
                    final g rva = this.rVA;
                    GMTrace.o(18166369484800L, 135350);
                    return rva;
                }
                GMTrace.o(18166369484800L, 135350);
                return xz;
            }
            
            @Override
            public final void LF(final String s) {
                GMTrace.i(18168114315264L, 135363);
                this.bFS().LF(s);
                GMTrace.o(18168114315264L, 135363);
            }
            
            @Override
            public final void Q(final Bundle bundle) {
                GMTrace.i(18167980097536L, 135362);
                this.bFS().Q(bundle);
                GMTrace.o(18167980097536L, 135362);
            }
            
            @Override
            public final void R(final Bundle bundle) {
                GMTrace.i(18168785403904L, 135368);
                this.bFS().R(bundle);
                GMTrace.o(18168785403904L, 135368);
            }
            
            @Override
            public final String Zi() {
                GMTrace.i(18167174791168L, 135356);
                final String aEr = e.this.aEr();
                GMTrace.o(18167174791168L, 135356);
                return aEr;
            }
            
            @Override
            public final boolean a(final com.tencent.mm.plugin.webview.stub.c c) {
                GMTrace.i(18166772137984L, 135353);
                if (e.this.inX == null) {
                    GMTrace.o(18166772137984L, 135353);
                    return true;
                }
                w.i("MicroMsg.MMWebViewClient", "onSceneEnd, instance hashcode = " + e.this.inX.hashCode());
                e.this.mHandler.post((Runnable)new Runnable() {
                    final /* synthetic */ com.tencent.mm.plugin.webview.stub.c rMU;
                    
                    {
                        GMTrace.i(18165966831616L, 135347);
                        GMTrace.o(18165966831616L, 135347);
                    }
                    
                    @Override
                    public final void run() {
                        GMTrace.i(18166101049344L, 135348);
                        try {
                            e.this.a(c);
                            GMTrace.o(18166101049344L, 135348);
                        }
                        catch (Exception ex) {
                            w.e("MicroMsg.MMWebViewClient", ex.getMessage());
                            GMTrace.o(18166101049344L, 135348);
                        }
                    }
                });
                final boolean a = this.bFS().a(c);
                GMTrace.o(18166772137984L, 135353);
                return a;
            }
            
            @Override
            public final boolean a(final String s, final String s2, final Bundle bundle, final boolean b) {
                GMTrace.i(18166906355712L, 135354);
                if (e.this.rQw == null) {
                    GMTrace.o(18166906355712L, 135354);
                    return false;
                }
                e.this.mHandler.post((Runnable)new Runnable(s2) {
                    final /* synthetic */ String iyk;
                    final /* synthetic */ String rHC;
                    final /* synthetic */ Bundle rHD;
                    final /* synthetic */ boolean rHE;
                    
                    {
                        GMTrace.i(18169859145728L, 135376);
                        GMTrace.o(18169859145728L, 135376);
                    }
                    
                    @Override
                    public final void run() {
                        GMTrace.i(18169993363456L, 135377);
                        e.this.rQw.a(s, s2, i.ac(bundle), b);
                        GMTrace.o(18169993363456L, 135377);
                    }
                });
                this.bFS().a(s, s2, bundle, b);
                GMTrace.o(18166906355712L, 135354);
                return false;
            }
            
            @Override
            public final String bDg() {
                GMTrace.i(18167040573440L, 135355);
                final String rVq = e.this.rVq;
                GMTrace.o(18167040573440L, 135355);
                return rVq;
            }
            
            @Override
            public final String bDh() {
                GMTrace.i(18167309008896L, 135357);
                final String bDh = this.bFS().bDh();
                GMTrace.o(18167309008896L, 135357);
                return bDh;
            }
            
            @Override
            public final void bDi() {
                GMTrace.i(18167845879808L, 135361);
                if (e.this.rQw != null) {
                    e.this.rQw.bDi();
                }
                GMTrace.o(18167845879808L, 135361);
            }
            
            @Override
            public final void bDj() {
                GMTrace.i(18168382750720L, 135365);
                if (e.this.rQw != null) {
                    e.this.rQw.bDj();
                }
                GMTrace.o(18168382750720L, 135365);
            }
            
            @Override
            public final Bundle d(final int n, Bundle d) {
                GMTrace.i(18168651186176L, 135367);
                d = this.bFS().d(n, d);
                GMTrace.o(18168651186176L, 135367);
                return d;
            }
            
            @Override
            public final void e(final String s, final String s2, final int n, final int n2) {
                GMTrace.i(18168516968448L, 135366);
                this.bFS().e(s, s2, n, n2);
                GMTrace.o(18168516968448L, 135366);
            }
            
            @Override
            public final void ei(final String s, final String s2) {
                GMTrace.i(18168248532992L, 135364);
                this.bFS().ei(s, s2);
                GMTrace.o(18168248532992L, 135364);
            }
            
            @Override
            public final void ej(final String s, final String s2) {
                GMTrace.i(18169053839360L, 135370);
                this.bFS().ej(s, s2);
                GMTrace.o(18169053839360L, 135370);
            }
            
            @Override
            public final void jt(final boolean b) {
                GMTrace.i(18167443226624L, 135358);
                this.bFS().jt(b);
                GMTrace.o(18167443226624L, 135358);
            }
            
            @Override
            public final void ju(final boolean b) {
                GMTrace.i(18167577444352L, 135359);
                this.bFS().ju(b);
                GMTrace.o(18167577444352L, 135359);
            }
            
            @Override
            public final void jv(final boolean b) {
                GMTrace.i(18168919621632L, 135369);
                this.bFS().jv(b);
                GMTrace.o(18168919621632L, 135369);
            }
            
            @Override
            public final boolean m(final int n, final Bundle bundle) {
                GMTrace.i(18166637920256L, 135352);
                w.i("MicroMsg.MMWebViewClient", "callback, actionCode = " + n);
                switch (n) {
                    default: {
                        w.e("MicroMsg.MMWebViewClient", "undefine action code!!!");
                        break;
                    }
                    case 1002: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Bundle euy;
                            
                            {
                                GMTrace.i(18161806082048L, 135316);
                                GMTrace.o(18161806082048L, 135316);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18161940299776L, 135317);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.f(bundle, "download_succ");
                                }
                                GMTrace.o(18161940299776L, 135317);
                            }
                        });
                        break;
                    }
                    case 1003: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Bundle euy;
                            
                            {
                                GMTrace.i(18164087783424L, 135333);
                                GMTrace.o(18164087783424L, 135333);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18164222001152L, 135334);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.f(bundle, "download_fail");
                                }
                                GMTrace.o(18164222001152L, 135334);
                            }
                        });
                        break;
                    }
                    case 1008: {
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Bundle euy;
                            
                            {
                                GMTrace.i(18165429960704L, 135343);
                                GMTrace.o(18165429960704L, 135343);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18165564178432L, 135344);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.f(bundle, "download_removed");
                                }
                                GMTrace.o(18165564178432L, 135344);
                            }
                        });
                        break;
                    }
                    case 1007: {
                        e.this.mHandler.post((Runnable)new Runnable(bundle.getLong("download_manager_downloadid")) {
                            final /* synthetic */ String eud = bundle.getString("download_manager_appid", "");
                            final /* synthetic */ int jVs = bundle.getInt("download_manager_progress");
                            final /* synthetic */ long rNa = bundle.getLong("download_manager_downloadid");
                            
                            {
                                GMTrace.i(18169322274816L, 135372);
                                GMTrace.o(18169322274816L, 135372);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18169456492544L, 135373);
                                if (e.this.rQw != null && e.this.rSb != null && e.this.rSb.bDM() != null && e.this.rSb.bDM().eS(42)) {
                                    e.this.rQw.g(this.eud, this.rNa, this.jVs);
                                }
                                GMTrace.o(18169456492544L, 135373);
                            }
                        });
                        break;
                    }
                    case 2003: {
                        e.this.mHandler.post((Runnable)new Runnable(bundle.getInt("webview_jssdk_file_item_progreess")) {
                            final /* synthetic */ int rNg = bundle.getInt("webview_jssdk_file_item_progreess");
                            final /* synthetic */ String rNh = bundle.getString("webview_jssdk_file_item_local_id");
                            
                            {
                                GMTrace.i(18170396016640L, 135380);
                                GMTrace.o(18170396016640L, 135380);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18170530234368L, 135381);
                                if (e.this.rQw != null) {
                                    e.this.rQw.co(this.rNh, this.rNg);
                                }
                                GMTrace.o(18170530234368L, 135381);
                            }
                        });
                        break;
                    }
                    case 2004: {
                        e.this.mHandler.post((Runnable)new Runnable(bundle.getInt("webview_jssdk_file_item_progreess")) {
                            final /* synthetic */ int hsX = bundle.getInt("webview_jssdk_file_item_progreess");
                            final /* synthetic */ String rME = bundle.getString("webview_jssdk_file_item_local_id");
                            
                            {
                                GMTrace.i(18170127581184L, 135378);
                                GMTrace.o(18170127581184L, 135378);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18170261798912L, 135379);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cp(this.rME, this.hsX);
                                }
                                GMTrace.o(18170261798912L, 135379);
                            }
                        });
                        break;
                    }
                    case 2005: {
                        e.this.mHandler.post((Runnable)new Runnable(bundle.getInt("webview_jssdk_file_item_progreess")) {
                            final /* synthetic */ int hsX = bundle.getInt("webview_jssdk_file_item_progreess");
                            final /* synthetic */ String ieu = bundle.getString("webview_jssdk_file_item_local_id");
                            
                            {
                                GMTrace.i(18164624654336L, 135337);
                                GMTrace.o(18164624654336L, 135337);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18164758872064L, 135338);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cq(this.ieu, this.hsX);
                                }
                                GMTrace.o(18164758872064L, 135338);
                            }
                        });
                        break;
                    }
                    case 2006: {
                        e.this.mHandler.post((Runnable)new Runnable(bundle.getInt("webview_jssdk_file_item_progreess")) {
                            final /* synthetic */ int hsX = bundle.getInt("webview_jssdk_file_item_progreess");
                            final /* synthetic */ String rME = bundle.getString("webview_jssdk_file_item_local_id");
                            
                            {
                                GMTrace.i(18165161525248L, 135341);
                                GMTrace.o(18165161525248L, 135341);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18165295742976L, 135342);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cr(this.rME, this.hsX);
                                }
                                GMTrace.o(18165295742976L, 135342);
                            }
                        });
                        break;
                    }
                    case 2010: {
                        e.this.mHandler.post((Runnable)new Runnable(bundle.getInt("webview_jssdk_file_item_progreess")) {
                            final /* synthetic */ int hsX = bundle.getInt("webview_jssdk_file_item_progreess");
                            final /* synthetic */ String ieu = bundle.getString("webview_jssdk_file_item_local_id");
                            
                            {
                                GMTrace.i(18164356218880L, 135335);
                                GMTrace.o(18164356218880L, 135335);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18164490436608L, 135336);
                                if (e.this.rQw != null) {
                                    e.this.rQw.cs(this.ieu, this.hsX);
                                }
                                GMTrace.o(18164490436608L, 135336);
                            }
                        });
                        break;
                    }
                    case 2002: {
                        final HashMap<String, String> hashMap = new HashMap<String, String>();
                        hashMap.put("err_msg", bundle.getString("playResult"));
                        hashMap.put("localId", bundle.getString("localId"));
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Map rMF;
                            
                            {
                                GMTrace.i(18161537646592L, 135314);
                                GMTrace.o(18161537646592L, 135314);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18161671864320L, 135315);
                                if (e.this.rQw != null) {
                                    e.this.rQw.Z(hashMap);
                                }
                                GMTrace.o(18161671864320L, 135315);
                            }
                        });
                        break;
                    }
                    case 2008: {
                        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
                        hashMap2.put("localId", bundle.getString("localId"));
                        hashMap2.put("err_msg", bundle.getString("recordResult"));
                        e.this.mHandler.post((Runnable)new Runnable() {
                            final /* synthetic */ Map rMF;
                            
                            {
                                GMTrace.i(18170664452096L, 135382);
                                GMTrace.o(18170664452096L, 135382);
                            }
                            
                            @Override
                            public final void run() {
                                GMTrace.i(18170798669824L, 135383);
                                if (e.this.rQw != null) {
                                    e.this.rQw.aa(hashMap2);
                                }
                                GMTrace.o(18170798669824L, 135383);
                            }
                        });
                        break;
                    }
                    case 1006: {
                        if (e.this.rQw != null) {
                            e.this.mHandler.post((Runnable)new Runnable() {
                                final /* synthetic */ Bundle euy;
                                
                                {
                                    GMTrace.i(18163819347968L, 135331);
                                    GMTrace.o(18163819347968L, 135331);
                                }
                                
                                @Override
                                public final void run() {
                                    boolean b = false;
                                    GMTrace.i(18163953565696L, 135332);
                                    final byte[] byteArray = bundle.getByteArray("jsapi_control_bytes");
                                    if (byteArray == null || e.this.rSb == null || e.this.rSb.bDM() == null) {
                                        final boolean b2 = byteArray != null;
                                        if (e.this.rSb != null) {
                                            b = true;
                                        }
                                        w.e("MicroMsg.MMWebViewClient", "has JSAPI_CONTROL_BYTES %b, has wvPerm %b", new Object[] { b2, b });
                                    }
                                    else {
                                        w.i("MicroMsg.MMWebViewClient", "update control bytes, %d", new Object[] { byteArray.length });
                                        e.this.rSb.bDM().tJT = byteArray;
                                    }
                                    if (e.this.rQw != null) {
                                        e.this.rQw.bFn();
                                    }
                                    GMTrace.o(18163953565696L, 135332);
                                }
                            });
                            break;
                        }
                        break;
                    }
                    case 90: {
                        if (e.this.rQw != null) {
                            e.this.mHandler.post((Runnable)new Runnable() {
                                final /* synthetic */ Bundle euy;
                                
                                {
                                    GMTrace.i(18165698396160L, 135345);
                                    GMTrace.o(18165698396160L, 135345);
                                }
                                
                                @Override
                                public final void run() {
                                    GMTrace.i(18165832613888L, 135346);
                                    if (e.this.rQw != null) {
                                        e.this.rQw.Mw(bundle.getString("webview_network_type"));
                                    }
                                    GMTrace.o(18165832613888L, 135346);
                                }
                            });
                            break;
                        }
                        break;
                    }
                }
                this.bFS().m(n, bundle);
                GMTrace.o(18166637920256L, 135352);
                return true;
            }
            
            @Override
            public final void o(final int n, final Bundle bundle) {
                GMTrace.i(18167711662080L, 135360);
                this.bFS().o(n, bundle);
                GMTrace.o(18167711662080L, 135360);
            }
            
            @Override
            public final boolean xC(final int n) {
                GMTrace.i(18166503702528L, 135351);
                final boolean xc = this.bFS().xC(n);
                GMTrace.o(18166503702528L, 135351);
                return xc;
            }
        };
        this.nJy = (Activity)inX.getContext();
        this.inX = inX;
        this.mHandler = new ae();
        this.rSb = new com.tencent.mm.plugin.webview.ui.tools.e(this.nJy, (WebView)inX);
        this.lJO = ljo;
        GMTrace.o(12098251784192L, 90139);
    }
    
    private void a(final String s, final String lji, final JsapiPermissionWrapper jsapiPermissionWrapper, final GeneralControlWrapper generalControlWrapper) {
        GMTrace.i(12100936138752L, 90159);
        if (!bg.nm(lji)) {
            this.rSb.b(lji, jsapiPermissionWrapper, generalControlWrapper);
            this.lJF.remove(lji);
            this.rVv = false;
            this.lJI = lji;
        }
        if (this.em(s, lji)) {
            this.rSb.b(s, jsapiPermissionWrapper, generalControlWrapper);
            this.lJF.remove(s);
            GMTrace.o(12100936138752L, 90159);
            return;
        }
        if (this.rQv == null || bg.nm(s) || !this.Mg(lji)) {
            GMTrace.o(12100936138752L, 90159);
            return;
        }
        this.rSb.b(s, jsapiPermissionWrapper, generalControlWrapper);
        this.lJF.remove(s);
        GMTrace.o(12100936138752L, 90159);
    }
    
    private boolean ad(final Bundle bundle) {
        GMTrace.i(12100801921024L, 90158);
        w.d("MicroMsg.MMWebViewClient", "[cpan] process a8 key:%d", new Object[] { System.currentTimeMillis() });
        final int int1 = bundle.getInt("geta8key_result_action_code");
        final String string = bundle.getString("geta8key_result_title");
        final String string2 = bundle.getString("geta8key_result_full_url");
        final String string3 = bundle.getString("geta8key_result_content");
        w.i("MicroMsg.MMWebViewClient", "processGetA8Key, actionCode = " + int1 + ", title = " + string + ", fullUrl = " + string2 + ", content = " + string3);
        final String[] stringArray = bundle.getStringArray("geta8key_result_http_header_key_list");
        final String[] stringArray2 = bundle.getStringArray("geta8key_result_http_header_value_list");
        final HashMap<String, String> rVw = new HashMap<String, String>();
        if (stringArray != null && stringArray2 != null && stringArray.length > 0 && stringArray2.length > 0 && stringArray.length == stringArray2.length) {
            for (int i = 0; i < stringArray.length; ++i) {
                rVw.put(stringArray[i], stringArray2[i]);
            }
        }
        this.rVw = rVw;
        switch (int1) {
            default: {
                w.i("MicroMsg.MMWebViewClient", "qrcode-getA8key-not_catch: action code = " + int1);
                GMTrace.o(12100801921024L, 90158);
                return false;
            }
            case 1: {
                w.i("MicroMsg.MMWebViewClient", "getA8key-text: " + string3);
                if (string3 == null || string3.length() == 0) {
                    w.e("MicroMsg.MMWebViewClient", "getA8key-text fail, invalid content");
                    GMTrace.o(12100801921024L, 90158);
                    return false;
                }
                this.inX.getSettings().setJavaScriptEnabled(false);
                this.inX.loadData(string3, "text/html", "utf-8");
                GMTrace.o(12100801921024L, 90158);
                return true;
            }
            case 2:
            case 7: {
                w.i("MicroMsg.MMWebViewClient", "getA8key-webview/no-notice: title = " + string + ", fullUrl = " + string2);
                if (string2 == null || string2.length() == 0) {
                    w.e("MicroMsg.MMWebViewClient", "getA8key-webview fail, invalid fullUrl");
                    GMTrace.o(12100801921024L, 90158);
                    return false;
                }
                if (!aa.Lf(string2)) {
                    w.f("MicroMsg.MMWebViewClient", "processGetA8Key qrcode, canLoadUrl fail, url = " + string2);
                    this.Mq(string2);
                    GMTrace.o(12100801921024L, 90158);
                    return true;
                }
                this.l(string2, rVw);
                GMTrace.o(12100801921024L, 90158);
                return true;
            }
            case 6: {
                w.i("MicroMsg.MMWebViewClient", "getA8key-special_webview: fullUrl = " + string2);
                if (string2 == null || string2.length() == 0) {
                    w.e("MicroMsg.MMWebViewClient", "getA8key-special_webview fail, invalid fullUrl");
                    GMTrace.o(12100801921024L, 90158);
                    return false;
                }
                if (!aa.Lf(string2)) {
                    w.f("MicroMsg.MMWebViewClient", "processGetA8Key special, canLoadUrl fail, url = " + string2);
                    this.Mq(string2);
                    GMTrace.o(12100801921024L, 90158);
                    return true;
                }
                this.inX.loadUrl(string2);
                GMTrace.o(12100801921024L, 90158);
                return true;
            }
        }
    }
    
    private void bFR() {
        GMTrace.i(16065459388416L, 119697);
        try {
            if (this.rQv != null) {
                final Bundle bundle = new Bundle();
                bundle.putInt("scene_end_type", 233);
                bundle.putInt("scene_end_listener_hash_code", this.inX.hashCode());
                this.rQv.a(6, bundle, this.inX.hashCode());
            }
            GMTrace.o(16065459388416L, 119697);
        }
        catch (Exception ex) {
            w.e("MicroMsg.MMWebViewClient", "removeSceneEnd, ex = " + ex.getMessage());
            GMTrace.o(16065459388416L, 119697);
        }
    }
    
    private boolean em(final String s, final String s2) {
        GMTrace.i(12100667703296L, 90157);
        if (bg.nm(s) || bg.nm(s2)) {
            GMTrace.o(12100667703296L, 90157);
            return false;
        }
        if (com.tencent.mm.plugin.webview.a.rBc.matcher(s).matches() && com.tencent.mm.plugin.webview.a.rBc.matcher(s2).matches()) {
            final String replaceFirst = s.replaceFirst("http://", "").replaceFirst("https://", "");
            final int index = replaceFirst.indexOf(35);
            String substring = replaceFirst;
            if (index > 0) {
                substring = replaceFirst.substring(0, index);
            }
            if (s2.replaceFirst("http://", "").replaceFirst("https://", "").startsWith(substring) && this.rQv != null && this.Mg(s)) {
                GMTrace.o(12100667703296L, 90157);
                return true;
            }
        }
        GMTrace.o(12100667703296L, 90157);
        return false;
    }
    
    private void f(final String p0, final boolean p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: istore          5
        //     3: ldc2_w          21073793908736
        //     6: ldc_w           157012
        //     9: invokestatic    com/tencent/gmtrace/GMTrace.i:(JI)V
        //    12: aload_0        
        //    13: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.nJy:Landroid/app/Activity;
        //    16: invokevirtual   android/app/Activity.isFinishing:()Z
        //    19: ifeq            32
        //    22: ldc2_w          21073793908736
        //    25: ldc_w           157012
        //    28: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    31: return         
        //    32: aload_0        
        //    33: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rSb:Lcom/tencent/mm/plugin/webview/ui/tools/e;
        //    36: ifnonnull       57
        //    39: ldc             "MicroMsg.MMWebViewClient"
        //    41: ldc_w           "startGetA8Key fail, after onDestroy"
        //    44: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //    47: ldc2_w          21073793908736
        //    50: ldc_w           157012
        //    53: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    56: return         
        //    57: aload_0        
        //    58: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.lJO:Z
        //    61: ifeq            92
        //    64: ldc             "MicroMsg.MMWebViewClient"
        //    66: ldc_w           "edw startGetA8Key, nevergeta8key"
        //    69: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //    72: aload_0        
        //    73: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rSb:Lcom/tencent/mm/plugin/webview/ui/tools/e;
        //    76: aload_1        
        //    77: aconst_null    
        //    78: aconst_null    
        //    79: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/e.b:(Ljava/lang/String;Lcom/tencent/mm/protocal/JsapiPermissionWrapper;Lcom/tencent/mm/protocal/GeneralControlWrapper;)V
        //    82: ldc2_w          21073793908736
        //    85: ldc_w           157012
        //    88: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    91: return         
        //    92: aload_0        
        //    93: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQv:Lcom/tencent/mm/plugin/webview/stub/d;
        //    96: ifnull          175
        //    99: aload_0        
        //   100: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.lJF:Ljava/util/Set;
        //   103: aload_1        
        //   104: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   109: ifeq            175
        //   112: aload_0        
        //   113: aload_1        
        //   114: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/widget/e.Mg:(Ljava/lang/String;)Z
        //   117: ifeq            175
        //   120: iconst_1       
        //   121: istore          4
        //   123: aload_0        
        //   124: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rSb:Lcom/tencent/mm/plugin/webview/ui/tools/e;
        //   127: aload_1        
        //   128: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/e.has:(Ljava/lang/String;)Z
        //   131: ifne            139
        //   134: iload           4
        //   136: ifeq            181
        //   139: iload_2        
        //   140: ifne            181
        //   143: ldc             "MicroMsg.MMWebViewClient"
        //   145: new             Ljava/lang/StringBuilder;
        //   148: dup            
        //   149: ldc_w           "edw startGetA8Key no need, wvPerm already has value, url = "
        //   152: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   155: aload_1        
        //   156: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   159: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   162: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   165: ldc2_w          21073793908736
        //   168: ldc_w           157012
        //   171: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   174: return         
        //   175: iconst_0       
        //   176: istore          4
        //   178: goto            123
        //   181: aload_0        
        //   182: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rVp:Lcom/tencent/mm/plugin/webview/ui/tools/widget/e$a;
        //   185: aload_1        
        //   186: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/widget/e$a.zt:(Ljava/lang/String;)I
        //   189: istore          4
        //   191: ldc             "MicroMsg.MMWebViewClient"
        //   193: new             Ljava/lang/StringBuilder;
        //   196: dup            
        //   197: ldc_w           "edw startGetA8Key, url = "
        //   200: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   203: aload_1        
        //   204: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   207: ldc_w           ", scene = "
        //   210: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   213: iload_3        
        //   214: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   217: ldc_w           ", username = "
        //   220: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   223: ldc             ""
        //   225: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   228: ldc_w           ", reason = "
        //   231: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   234: iload           4
        //   236: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   239: ldc_w           ", force = "
        //   242: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   245: iload_2        
        //   246: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   249: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   252: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   255: ldc             "MicroMsg.MMWebViewClient"
        //   257: ldc_w           "edw startGetA8Key, begin, set a default permission"
        //   260: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   263: aload_0        
        //   264: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.lJF:Ljava/util/Set;
        //   267: aload_1        
        //   268: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   273: pop            
        //   274: aload_0        
        //   275: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rSb:Lcom/tencent/mm/plugin/webview/ui/tools/e;
        //   278: aload_1        
        //   279: aconst_null    
        //   280: aconst_null    
        //   281: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/e.b:(Ljava/lang/String;Lcom/tencent/mm/protocal/JsapiPermissionWrapper;Lcom/tencent/mm/protocal/GeneralControlWrapper;)V
        //   284: aload_0        
        //   285: iconst_1       
        //   286: putfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rVv:Z
        //   289: aload_0        
        //   290: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rVo:Lcom/tencent/mm/plugin/webview/ui/tools/widget/e$b;
        //   293: astore          6
        //   295: aload           6
        //   297: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e$b.rNE:I
        //   300: ifne            367
        //   303: aload           6
        //   305: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e$b.rVz:Lcom/tencent/mm/plugin/webview/ui/tools/widget/e;
        //   308: astore          7
        //   310: new             Landroid/os/Bundle;
        //   313: dup            
        //   314: invokespecial   android/os/Bundle.<init>:()V
        //   317: astore          8
        //   319: aload           8
        //   321: ldc_w           "scene_end_type"
        //   324: sipush          233
        //   327: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   330: aload           8
        //   332: ldc_w           "scene_end_listener_hash_code"
        //   335: aload           7
        //   337: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.inX:Lcom/tencent/mm/ui/widget/MMWebView;
        //   340: invokevirtual   java/lang/Object.hashCode:()I
        //   343: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   346: aload           7
        //   348: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQv:Lcom/tencent/mm/plugin/webview/stub/d;
        //   351: iconst_5       
        //   352: aload           8
        //   354: aload           7
        //   356: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.inX:Lcom/tencent/mm/ui/widget/MMWebView;
        //   359: invokevirtual   java/lang/Object.hashCode:()I
        //   362: invokeinterface com/tencent/mm/plugin/webview/stub/d.a:(ILandroid/os/Bundle;I)V
        //   367: aload           6
        //   369: aload           6
        //   371: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e$b.rNE:I
        //   374: iconst_1       
        //   375: iadd           
        //   376: putfield        com/tencent/mm/plugin/webview/ui/tools/widget/e$b.rNE:I
        //   379: new             Landroid/os/Bundle;
        //   382: dup            
        //   383: invokespecial   android/os/Bundle.<init>:()V
        //   386: astore          6
        //   388: aload           6
        //   390: ldc_w           "geta8key_data_req_url"
        //   393: aload_1        
        //   394: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   397: aload           6
        //   399: ldc_w           "geta8key_data_username"
        //   402: ldc             ""
        //   404: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   407: aload           6
        //   409: ldc_w           "geta8key_data_scene"
        //   412: iload_3        
        //   413: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   416: aload           6
        //   418: ldc_w           "geta8key_data_reason"
        //   421: iload           4
        //   423: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   426: aload_0        
        //   427: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.inX:Lcom/tencent/mm/ui/widget/MMWebView;
        //   430: getfield        com/tencent/mm/ui/widget/MMWebView.isX5Kernel:Z
        //   433: ifeq            546
        //   436: aload           6
        //   438: ldc_w           "geta8key_data_flag"
        //   441: iconst_1       
        //   442: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   445: aload           6
        //   447: ldc_w           "geta8key_data_net_type"
        //   450: invokestatic    com/tencent/mm/pluginsdk/ui/tools/s.bCt:()Ljava/lang/String;
        //   453: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   456: aload_0        
        //   457: aload_1        
        //   458: putfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.lJM:Ljava/lang/String;
        //   461: aload_0        
        //   462: aload           6
        //   464: aload_1        
        //   465: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/widget/e.e:(Landroid/os/Bundle;Ljava/lang/String;)V
        //   468: aload_0        
        //   469: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQv:Lcom/tencent/mm/plugin/webview/stub/d;
        //   472: sipush          233
        //   475: aload           6
        //   477: invokeinterface com/tencent/mm/plugin/webview/stub/d.q:(ILandroid/os/Bundle;)Z
        //   482: istore_2       
        //   483: ldc             "MicroMsg.MMWebViewClient"
        //   485: new             Ljava/lang/StringBuilder;
        //   488: dup            
        //   489: ldc_w           "startGetA8Key, doScene ret = "
        //   492: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   495: iload_2        
        //   496: invokevirtual   java/lang/StringBuilder.append:(Z)Ljava/lang/StringBuilder;
        //   499: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   502: invokestatic    com/tencent/mm/sdk/platformtools/w.i:(Ljava/lang/String;Ljava/lang/String;)V
        //   505: ldc2_w          21073793908736
        //   508: ldc_w           157012
        //   511: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //   514: return         
        //   515: astore          7
        //   517: ldc             "MicroMsg.MMWebViewClient"
        //   519: new             Ljava/lang/StringBuilder;
        //   522: dup            
        //   523: ldc_w           "addSceneEnd, ex = "
        //   526: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   529: aload           7
        //   531: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   534: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   537: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   540: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   543: goto            367
        //   546: aload           6
        //   548: ldc_w           "geta8key_data_flag"
        //   551: iconst_0       
        //   552: invokevirtual   android/os/Bundle.putInt:(Ljava/lang/String;I)V
        //   555: goto            445
        //   558: astore_1       
        //   559: ldc             "MicroMsg.MMWebViewClient"
        //   561: new             Ljava/lang/StringBuilder;
        //   564: dup            
        //   565: ldc_w           "startGetA8Key, ex = "
        //   568: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   571: aload_1        
        //   572: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //   575: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   578: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   581: invokestatic    com/tencent/mm/sdk/platformtools/w.w:(Ljava/lang/String;Ljava/lang/String;)V
        //   584: iload           5
        //   586: istore_2       
        //   587: goto            483
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  310    367    515    546    Ljava/lang/Exception;
        //  468    483    558    590    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0483:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.DecompilerLinkProvider.generateContent(DecompilerLinkProvider.java:97)
        //     at us.deathmarine.luyten.OpenFile.decompileWithNavigationLinks(OpenFile.java:469)
        //     at us.deathmarine.luyten.OpenFile.decompile(OpenFile.java:442)
        //     at us.deathmarine.luyten.Model.extractClassToTextPane(Model.java:420)
        //     at us.deathmarine.luyten.Model.openEntryByTreePath(Model.java:339)
        //     at us.deathmarine.luyten.Model$TreeListener$1.run(Model.java:266)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private void l(final String s, final Map<String, String> map) {
        GMTrace.i(16615886290944L, 123798);
        final String aq = bg.aq(this.aEr(), this.rVq);
        if (bg.nm(aq)) {
            w.e("MicroMsg.MMWebViewClient", "after getA8Key, currentURL is null or nil, wtf");
            this.inX.loadUrl(s);
            GMTrace.o(16615886290944L, 123798);
            return;
        }
        if (this.rQw == null) {
            this.inX.loadUrl(s);
            GMTrace.o(16615886290944L, 123798);
            return;
        }
        if (bg.nl(s).contains("#wechat_redirect")) {
            this.inX.loadUrl(s);
            GMTrace.o(16615886290944L, 123798);
            return;
        }
        if (!this.em(aq, s)) {
            final String lx = p.Lx(aq);
            final String lx2 = p.Lx(s);
            int n;
            if (!bg.nm(lx2) && !bg.nm(lx) && lx2.equals(lx) && this.rQv != null && this.Mg(aq)) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                this.inX.loadUrl(s);
                GMTrace.o(16615886290944L, 123798);
                return;
            }
        }
        this.rVt.put(aq, s);
        this.rLN.put(aq, map);
        this.rQw.m(s, (Map)map);
        GMTrace.o(16615886290944L, 123798);
    }
    
    public boolean Fi(final String s) {
        GMTrace.i(12098386001920L, 90140);
        GMTrace.o(12098386001920L, 90140);
        return false;
    }
    
    public final boolean MD(final String s) {
        GMTrace.i(12098654437376L, 90142);
        for (final com.tencent.mm.plugin.webview.ui.tools.jsapi.b b : this.rVs) {
            if (b.zE(s)) {
                w.i("MicroMsg.MMWebViewClient", "url handled, ret = " + b.zF(s) + ", url = " + s);
                GMTrace.o(12098654437376L, 90142);
                return true;
            }
        }
        final boolean fi = this.Fi(s);
        GMTrace.o(12098654437376L, 90142);
        return fi;
    }
    
    public boolean Mg(final String s) {
        GMTrace.i(18162745606144L, 135323);
        if (this.inX != null) {
            final boolean a = o.a(s, this.rQv, this.inX.hashCode());
            GMTrace.o(18162745606144L, 135323);
            return a;
        }
        GMTrace.o(18162745606144L, 135323);
        return false;
    }
    
    public boolean Mp(final String rVq) {
        GMTrace.i(18163550912512L, 135329);
        if (this.rQv == null) {
            this.rVq = rVq;
            this.bDS();
            GMTrace.o(18163550912512L, 135329);
            return true;
        }
        GMTrace.o(18163550912512L, 135329);
        return false;
    }
    
    public void Mq(final String s) {
        GMTrace.i(18162074517504L, 135318);
        GMTrace.o(18162074517504L, 135318);
    }
    
    public g XZ() {
        GMTrace.i(18162342952960L, 135320);
        GMTrace.o(18162342952960L, 135320);
        return null;
    }
    
    public int Ya() {
        GMTrace.i(19456201850880L, 144960);
        GMTrace.o(19456201850880L, 144960);
        return 0;
    }
    
    public k a(final WebView webView, final j j) {
        GMTrace.i(19457812463616L, 144972);
        if (j == null || j.getUrl() == null || bg.nm(j.getUrl().toString())) {
            final k a = super.a(webView, j);
            GMTrace.o(19457812463616L, 144972);
            return a;
        }
        w.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { j.getUrl(), j.getMethod(), j.isForMainFrame() });
        j.getUrl().toString();
        final o rfx = o.a.rFX;
        this.aEr();
        webView.hashCode();
        GMTrace.o(19457812463616L, 144972);
        return null;
    }
    
    public k a(final WebView webView, j rfx, final Bundle bundle) {
        GMTrace.i(19457946681344L, 144973);
        if (rfx == null || rfx.getUrl() == null || bg.nm(rfx.getUrl().toString())) {
            final k a = super.a(webView, rfx, bundle);
            GMTrace.o(19457946681344L, 144973);
            return a;
        }
        w.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { rfx.getUrl(), rfx.getMethod(), rfx.isForMainFrame() });
        while (true) {
            if (MMWebView.getTbsCoreVersion((Context)this.nJy) <= 36541) {
                break Label_0168;
            }
            try {
                final int int1 = bundle.getInt("resourceType");
                if (int1 == 1 || int1 == 7) {
                    w.i("MicroMsg.MMWebViewClient", "get resoutce type is iframe : %d, start geta8key", new Object[] { int1 });
                    this.f(rfx.getUrl().toString(), false, 5);
                }
                rfx.getUrl().toString();
                rfx = (j)o.a.rFX;
                this.aEr();
                webView.hashCode();
                GMTrace.o(19457946681344L, 144973);
                return null;
            }
            catch (Exception ex) {
                w.w("MicroMsg.MMWebViewClient", "get resource type failed Exception ; %s", new Object[] { ex.getMessage() });
                continue;
            }
            catch (Throwable t) {
                w.w("MicroMsg.MMWebViewClient", "get resource type failed Throwable ; %s", new Object[] { t.getMessage() });
                continue;
            }
            break;
        }
    }
    
    public void a(final d d, final com.tencent.mm.plugin.webview.ui.tools.e e) {
        GMTrace.i(19456067633152L, 144959);
        GMTrace.o(19456067633152L, 144959);
    }
    
    public void a(final com.tencent.mm.plugin.webview.ui.tools.jsapi.d d) {
        GMTrace.i(18162477170688L, 135321);
        GMTrace.o(18162477170688L, 135321);
    }
    
    public void a(final f f) {
        GMTrace.i(18162611388416L, 135322);
        GMTrace.o(18162611388416L, 135322);
    }
    
    public final void a(final WebView webView, final int n, final String s, final String s2) {
        GMTrace.i(19457409810432L, 144969);
        super.a(webView, n, s, s2);
        GMTrace.o(19457409810432L, 144969);
    }
    
    public final void a(final WebView webView, final com.tencent.xweb.g g, final SslError sslError) {
        GMTrace.i(19457275592704L, 144968);
        super.a(webView, g, sslError);
        GMTrace.o(19457275592704L, 144968);
    }
    
    public final void a(final WebView webView, final String s) {
        GMTrace.i(19457141374976L, 144967);
        w.d("MicroMsg.MMWebViewClient", "onPageFinished url = %s", new Object[] { s });
        if (this.rQv == null) {
            GMTrace.o(19457141374976L, 144967);
            return;
        }
        super.a(webView, s);
        if (!aa.Lf(s)) {
            w.f("MicroMsg.MMWebViewClient", "onPageFinished, canLoadUrl fail, url = " + s);
            this.Mq(s);
            GMTrace.o(19457141374976L, 144967);
            return;
        }
        this.rVr = "";
        if (s.equals("file:///android_asset/jsapi/wxjs.js")) {
            w.i("MicroMsg.MMWebViewClient", "onPageFinished, js is finished loaded");
            this.d(webView, s);
            GMTrace.o(19457141374976L, 144967);
            return;
        }
        this.rQz.bFi();
        this.d(webView, s);
        GMTrace.o(19457141374976L, 144967);
    }
    
    public void a(final WebView webView, final String s, final Bitmap bitmap) {
        GMTrace.i(19456470286336L, 144962);
        GMTrace.o(19456470286336L, 144962);
    }
    
    public final void a(final WebView webView, final String s, final boolean b) {
        GMTrace.i(19456872939520L, 144965);
        w.i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory, url = %s, isReload = %b", new Object[] { s, b });
        super.a(webView, s, b);
        final String url = webView.getUrl();
        if (this.lJO) {
            this.aI(url, false);
        }
        if (this.rSb != null && !this.rSb.has(url)) {
            w.i("MicroMsg.MMWebViewClient", "doUpdateVisitedHistory start geta8key, url = %s", new Object[] { url });
            this.aI(url, false);
        }
        GMTrace.o(19456872939520L, 144965);
    }
    
    public final boolean a(final com.tencent.mm.plugin.webview.stub.c c) {
        GMTrace.i(16065593606144L, 119698);
        final int type = c.getType();
        final int bDe = c.bDe();
        final int bDf = c.bDf();
        c.En();
        Bundle data;
        if ((data = c.getData()) == null) {
            data = new Bundle();
        }
        if (this.inX == null) {
            w.w("MicroMsg.MMWebViewClient", "onSceneEnd, viewWV is null, do nothing");
            GMTrace.o(16065593606144L, 119698);
            return true;
        }
        if (this.nJy.isFinishing() || this.rSb == null) {
            w.w("MicroMsg.MMWebViewClient", "onSceneEnd, isFinishing, do nothing");
            GMTrace.o(16065593606144L, 119698);
            return true;
        }
        final int int1 = data.getInt("scene_end_listener_hash_code");
        w.i("MicroMsg.MMWebViewClient", "get hash code = %d, self hash code = %d", new Object[] { int1, this.inX.hashCode() });
        w.i("MicroMsg.MMWebViewClient", "edw onSceneEnd, type = " + type + ", errCode = " + bDf + ", errType = " + bDe);
        if (int1 != this.inX.hashCode()) {
            w.e("MicroMsg.MMWebViewClient", "hash code not equal");
            GMTrace.o(16065593606144L, 119698);
            return true;
        }
        Label_0260: {
            switch (type) {
                case 233: {
                    final b rVo = this.rVo;
                    --rVo.rNE;
                    if (rVo.rNE <= 0) {
                        rVo.rVz.bFR();
                    }
                    final JsapiPermissionWrapper jsapiPermissionWrapper = new JsapiPermissionWrapper(data.getByteArray("geta8key_result_jsapi_perm_control_bytes"));
                    final GeneralControlWrapper generalControlWrapper = new GeneralControlWrapper(data.getInt("geta8key_result_general_ctrl_b1"));
                    final int int2 = data.getInt("geta8key_result_reason");
                    w.i("MicroMsg.MMWebViewClient", "edw geta8key onSceneEnd, req reason = " + int2);
                    switch (int2) {
                        default: {
                            break Label_0260;
                        }
                        case 0:
                        case 2: {
                            if ((bDe == 0 && bDf == 0) || (bDe == 4 && bDf == -2005)) {
                                this.a(data.getString("geta8key_result_req_url"), data.getString("geta8key_result_full_url"), jsapiPermissionWrapper, generalControlWrapper);
                                this.ad(data);
                                break Label_0260;
                            }
                            break Label_0260;
                        }
                        case 1:
                        case 5: {
                            if (bDe == 0 && bDf == 0) {
                                final String string = data.getString("geta8key_result_req_url");
                                this.rSb.b(string, jsapiPermissionWrapper, generalControlWrapper);
                                this.lJF.remove(string);
                                break Label_0260;
                            }
                            if (bDe == 4 && bDf == -2005) {
                                this.inX.stopLoading();
                                this.a(data.getString("geta8key_result_req_url"), data.getString("geta8key_result_full_url"), jsapiPermissionWrapper, generalControlWrapper);
                                this.ad(data);
                                break Label_0260;
                            }
                            break Label_0260;
                        }
                    }
                    break;
                }
            }
        }
        GMTrace.o(16065593606144L, 119698);
        return true;
    }
    
    public final String aEr() {
        GMTrace.i(12101070356480L, 90160);
        if (!bg.nm(this.lJH)) {
            final String ljh = this.lJH;
            GMTrace.o(12101070356480L, 90160);
            return ljh;
        }
        if (this.mHandler == null) {
            GMTrace.o(12101070356480L, 90160);
            return null;
        }
        if (Thread.currentThread().getId() != this.mHandler.getLooper().getThread().getId()) {
            final String s = (String)new bb<String>("") {
                {
                    GMTrace.i(18169590710272L, 135374);
                    GMTrace.o(18169590710272L, 135374);
                }
            }.b(this.mHandler);
            GMTrace.o(12101070356480L, 90160);
            return s;
        }
        if (this.inX == null) {
            GMTrace.o(12101070356480L, 90160);
            return "";
        }
        final String url = this.inX.getUrl();
        GMTrace.o(12101070356480L, 90160);
        return url;
    }
    
    public final void aI(final String s, final boolean b) {
        GMTrace.i(12100265050112L, 90154);
        this.f(s, b, this.Ya());
        GMTrace.o(12100265050112L, 90154);
    }
    
    public final void b(final WebView webView, final String s, final Bitmap bitmap) {
        GMTrace.i(19457007157248L, 144966);
        w.d("MicroMsg.MMWebViewClient", "onPageStarted url = %s", new Object[] { s });
        if (this.Mp(s)) {
            if (!this.rVu) {
                webView.stopLoading();
            }
            GMTrace.o(19457007157248L, 144966);
            return;
        }
        if (!aa.Lf(s)) {
            w.f("MicroMsg.MMWebViewClient", "onPageStarted, canLoadUrl fail, url = " + s);
            this.Mq(s);
            GMTrace.o(19457007157248L, 144966);
            return;
        }
        if (this.MD(s)) {
            this.rVr = s;
            GMTrace.o(19457007157248L, 144966);
            return;
        }
        super.b(webView, this.lJH = s, bitmap);
        this.rQz.bFh();
        if (this.Mg(s)) {
            this.inX.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", (ValueCallback)null);
            if (this.rQw != null) {
                this.rQw.m((String)this.rVt.get(s), (Map)this.rLN.get(s));
            }
        }
        this.aI(s, false);
        this.a(webView, s, bitmap);
        GMTrace.o(19457007157248L, 144966);
    }
    
    public final boolean b(final WebView webView, final String s) {
        GMTrace.i(19456738721792L, 144964);
        w.i("MicroMsg.MMWebViewClient", "edw opt, shouldOverride url = " + s);
        if (this.rQv == null) {
            w.e("MicroMsg.MMWebViewClient", "Service not ready yet, make sure url loading happens after service connected");
            GMTrace.o(19456738721792L, 144964);
            return true;
        }
        if (!aa.Lf(s)) {
            w.f("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, URL load failed, url = " + s);
            this.Mq(s);
            GMTrace.o(19456738721792L, 144964);
            return true;
        }
        if (s.equals(this.rVr)) {
            this.rVr = "";
            GMTrace.o(19456738721792L, 144964);
            return true;
        }
        final boolean md = this.MD(s);
        if (!md && s.startsWith("weixin://")) {
            w.e("MicroMsg.MMWebViewClient", "shouldOverrideUrlLoading, can not deal with this weixin scheme, stop directly, url = %s", new Object[] { s });
            GMTrace.o(19456738721792L, 144964);
            return true;
        }
        if (md) {
            GMTrace.o(19456738721792L, 144964);
            return true;
        }
        final int zt = this.rVp.zt(s);
        if ((zt != 0 && zt != 2) || this.lJO) {
            GMTrace.o(19456738721792L, 144964);
            return false;
        }
        w.i("MicroMsg.MMWebViewClient", "edw shouldOverride, should not continue, reason = " + zt);
        if (this.Mg(s)) {
            this.inX.stopLoading();
            this.inX.post((Runnable)new Runnable() {
                {
                    GMTrace.i(18161269211136L, 135312);
                    GMTrace.o(18161269211136L, 135312);
                }
                
                @Override
                public final void run() {
                    GMTrace.i(18161403428864L, 135313);
                    e.this.zz(s);
                    GMTrace.o(18161403428864L, 135313);
                }
            });
        }
        else {
            this.inX.stopLoading();
        }
        if (s.equals(this.lJM)) {
            w.w("MicroMsg.MMWebViewClient", "shouldOverride, url equals lastGetA8KeyUrl, not trigger geta8key");
            GMTrace.o(19456738721792L, 144964);
            return false;
        }
        this.aI(s, true);
        GMTrace.o(19456738721792L, 144964);
        return true;
    }
    
    public final void bDS() {
        GMTrace.i(12100130832384L, 90153);
        w.i("MicroMsg.MMWebViewClient", "tryBindService");
        this.nJy.bindService(new Intent((Context)this.nJy, (Class)WebViewStubService.class), (ServiceConnection)this.rVx, 1);
        GMTrace.o(12100130832384L, 90153);
    }
    
    public final void bFQ() {
        GMTrace.i(18163416694784L, 135328);
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("init_url", this.rVq);
        hashMap.put("webview_type", "1");
        hashMap.put("init_font_size", "1");
        this.rQw = new com.tencent.mm.plugin.webview.ui.tools.jsapi.d(this.inX, this.rSb, (Map)hashMap, this.rQv, this.inX.hashCode());
        this.rQw.rRZ = null;
        this.rVs.add((com.tencent.mm.plugin.webview.ui.tools.jsapi.b)this.rQw);
        this.rVs.add((com.tencent.mm.plugin.webview.ui.tools.jsapi.b)new com.tencent.mm.plugin.webview.ui.tools.jsapi.e(this.inX, this.rQv, this.inX.hashCode(), this.rQw));
        this.a(this.rQz = new f((WebView)this.inX, this.rQw, (f$a)new f$a() {
            {
                GMTrace.i(12069260754944L, 89923);
                GMTrace.o(12069260754944L, 89923);
            }
            
            public final void bEB() {
                GMTrace.i(12069394972672L, 89924);
                e.this.a(e.this.rQw);
                GMTrace.o(12069394972672L, 89924);
            }
        }, false));
        while (true) {
            try {
                final int int1 = bg.getInt(this.rQv.LM("WebviewDisableDigestVerify"), 0);
                w.i("MicroMsg.MMWebViewClient", "js digest verification config = %d", new Object[] { int1 });
                if (int1 == 0 && this.nJy.getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("wvsha1", true)) {
                    this.rQz.bFu();
                }
                GMTrace.o(18163416694784L, 135328);
            }
            catch (Exception ex) {
                w.w("MicroMsg.MMWebViewClient", "getting js digest verification config fails, ex = " + ex.getMessage());
                final int int1 = 0;
                continue;
            }
            break;
        }
    }
    
    public void bFf() {
        GMTrace.i(18163148259328L, 135326);
        GMTrace.o(18163148259328L, 135326);
    }
    
    public void bFg() {
        GMTrace.i(16065325170688L, 119696);
        while (true) {
            try {
                this.rQv.a(this.rVq, true, (Bundle)null);
                if (this.MD(this.rVq)) {
                    GMTrace.o(16065325170688L, 119696);
                    return;
                }
            }
            catch (Exception ex) {
                w.w("MicroMsg.MMWebViewClient", "postBinded, jumpToActivity, ex = " + ex.getMessage());
                continue;
            }
            break;
        }
        Uri uri;
        if ((uri = Uri.parse(this.rVq)).getScheme() == null) {
            this.rVq += "http://";
            uri = Uri.parse(this.rVq);
        }
        if (uri.getScheme().startsWith("http")) {
            w.i("MicroMsg.MMWebViewClient", "uri scheme not startwith http, scheme = " + uri.getScheme());
            String rVq;
            if (this.rVu) {
                rVq = "";
            }
            else {
                rVq = this.rVq;
            }
            this.rVp = new a(rVq);
            this.rVu = false;
            if (this.lJO || this.rSb.has(this.rVq)) {
                this.inX.loadUrl(this.rVq);
                GMTrace.o(16065325170688L, 119696);
                return;
            }
            this.aI(this.rVq, false);
            GMTrace.o(16065325170688L, 119696);
        }
        else {
            if (!aa.Lf(this.rVq)) {
                this.Mq(this.rVq);
                GMTrace.o(16065325170688L, 119696);
                return;
            }
            this.inX.loadUrl(this.rVq);
            GMTrace.o(16065325170688L, 119696);
        }
    }
    
    public final void cleanup() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: ldc_w           135327
        //     6: invokestatic    com/tencent/gmtrace/GMTrace.i:(JI)V
        //     9: aload_0        
        //    10: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rVx:Lcom/tencent/mm/plugin/webview/ui/tools/widget/e$c;
        //    13: ifnull          27
        //    16: aload_0        
        //    17: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.nJy:Landroid/app/Activity;
        //    20: aload_0        
        //    21: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rVx:Lcom/tencent/mm/plugin/webview/ui/tools/widget/e$c;
        //    24: invokevirtual   android/app/Activity.unbindService:(Landroid/content/ServiceConnection;)V
        //    27: aload_0        
        //    28: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQw:Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/d;
        //    31: ifnull          41
        //    34: aload_0        
        //    35: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQw:Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/d;
        //    38: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/jsapi/d.detach:()V
        //    41: aload_0        
        //    42: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQz:Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/f;
        //    45: ifnull          55
        //    48: aload_0        
        //    49: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQz:Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/f;
        //    52: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/jsapi/f.detach:()V
        //    55: aload_0        
        //    56: invokespecial   com/tencent/mm/plugin/webview/ui/tools/widget/e.bFR:()V
        //    59: aload_0        
        //    60: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.rQv:Lcom/tencent/mm/plugin/webview/stub/d;
        //    63: aload_0        
        //    64: getfield        com/tencent/mm/plugin/webview/ui/tools/widget/e.inX:Lcom/tencent/mm/ui/widget/MMWebView;
        //    67: invokevirtual   java/lang/Object.hashCode:()I
        //    70: invokeinterface com/tencent/mm/plugin/webview/stub/d.xF:(I)V
        //    75: aload_0        
        //    76: invokevirtual   com/tencent/mm/plugin/webview/ui/tools/widget/e.bFf:()V
        //    79: ldc2_w          18163282477056
        //    82: ldc_w           135327
        //    85: invokestatic    com/tencent/gmtrace/GMTrace.o:(JI)V
        //    88: return         
        //    89: astore_1       
        //    90: ldc             "MicroMsg.MMWebViewClient"
        //    92: aload_1        
        //    93: invokevirtual   java/lang/Exception.getMessage:()Ljava/lang/String;
        //    96: invokestatic    com/tencent/mm/sdk/platformtools/w.e:(Ljava/lang/String;Ljava/lang/String;)V
        //    99: goto            27
        //   102: astore_1       
        //   103: ldc             "MicroMsg.MMWebViewClient"
        //   105: aload_1        
        //   106: ldc             ""
        //   108: iconst_0       
        //   109: anewarray       Ljava/lang/Object;
        //   112: invokestatic    com/tencent/mm/sdk/platformtools/w.printErrStackTrace:(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
        //   115: goto            75
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  16     27     89     102    Ljava/lang/Exception;
        //  59     75     102    118    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0075:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:757)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:655)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:532)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:499)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:141)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:130)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:105)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at us.deathmarine.luyten.DecompilerLinkProvider.generateContent(DecompilerLinkProvider.java:97)
        //     at us.deathmarine.luyten.OpenFile.decompileWithNavigationLinks(OpenFile.java:469)
        //     at us.deathmarine.luyten.OpenFile.decompile(OpenFile.java:442)
        //     at us.deathmarine.luyten.Model.extractClassToTextPane(Model.java:420)
        //     at us.deathmarine.luyten.Model.openEntryByTreePath(Model.java:339)
        //     at us.deathmarine.luyten.Model$TreeListener$1.run(Model.java:266)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public void d(final WebView webView, final String s) {
        GMTrace.i(19456604504064L, 144963);
        GMTrace.o(19456604504064L, 144963);
    }
    
    public k e(final WebView webView, final String s) {
        GMTrace.i(19457678245888L, 144971);
        w.i("MicroMsg.MMWebViewClient", "shouldInterceptRequest, url = %s", new Object[] { s });
        final o rfx = o.a.rFX;
        this.aEr();
        webView.hashCode();
        GMTrace.o(19457678245888L, 144971);
        return null;
    }
    
    public void e(final Bundle bundle, final String s) {
        GMTrace.i(19456336068608L, 144961);
        GMTrace.o(19456336068608L, 144961);
    }
    
    public void f(final WebView webView, final String s) {
        GMTrace.i(19457544028160L, 144970);
        w.i("MicroMsg.MMWebViewClient", "edw onLoadResource opt, url = " + s);
        super.f(webView, s);
        GMTrace.o(19457544028160L, 144970);
    }
    
    public void zz(final String s) {
        GMTrace.i(18163685130240L, 135330);
        final HashMap<String, String> hashMap = new HashMap<String, String>(2);
        hashMap.put("Pragma", "no-cache");
        hashMap.put("Cache-Control", "no-cache");
        this.inX.loadUrl(s, (Map)hashMap);
        GMTrace.o(18163685130240L, 135330);
    }
    
    protected static final class a
    {
        private static final Pattern lIw;
        private String lIx;
        
        static {
            GMTrace.i(12068589666304L, 89918);
            lIw = Pattern.compile(".*#.*wechat_redirect");
            GMTrace.o(12068589666304L, 89918);
        }
        
        public a(final String lIx) {
            GMTrace.i(12068321230848L, 89916);
            this.lIx = null;
            this.lIx = lIx;
            GMTrace.o(12068321230848L, 89916);
        }
        
        public final int zt(final String s) {
            GMTrace.i(12068455448576L, 89917);
            if (bg.nm(s)) {
                w.e("MicroMsg.MMWebViewClient", "getReason fail, url is null");
                GMTrace.o(12068455448576L, 89917);
                return 0;
            }
            if (s.equals(this.lIx)) {
                GMTrace.o(12068455448576L, 89917);
                return 0;
            }
            if (a.lIw.matcher(s).find()) {
                GMTrace.o(12068455448576L, 89917);
                return 2;
            }
            GMTrace.o(12068455448576L, 89917);
            return 1;
        }
    }
    
    protected final class b
    {
        int rNE;
        final /* synthetic */ e rVz;
        
        protected b() {
            GMTrace.i(12071810891776L, 89942);
            this.rNE = 0;
            GMTrace.o(12071810891776L, 89942);
        }
    }
    
    protected class c implements ServiceConnection
    {
        public c() {
            GMTrace.i(18160866557952L, 135309);
            GMTrace.o(18160866557952L, 135309);
        }
        
        public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            GMTrace.i(18161000775680L, 135310);
            w.i("MicroMsg.MMWebViewClient", "onServiceConnected");
            if (e.this.inX == null) {
                w.e("MicroMsg.MMWebViewClient", "onServiceConnected, activity destroyed");
                GMTrace.o(18161000775680L, 135310);
                return;
            }
            try {
                (e.this.rQv = d$a.X(binder)).a((com.tencent.mm.plugin.webview.stub.e)e.this.rVy, e.this.inX.hashCode());
                e.this.a(e.this.rQv, e.this.rSb);
                e.this.bFQ();
                e.this.bFg();
                GMTrace.o(18161000775680L, 135310);
            }
            catch (Exception ex) {
                w.e("MicroMsg.MMWebViewClient", "addCallback fail, ex = %s", new Object[] { ex.getMessage() });
                GMTrace.o(18161000775680L, 135310);
            }
        }
        
        public void onServiceDisconnected(final ComponentName componentName) {
            GMTrace.i(18161134993408L, 135311);
            w.i("MicroMsg.MMWebViewClient", "edw onServiceDisconnected");
            if (!e.this.nJy.isFinishing()) {
                w.i("MicroMsg.MMWebViewClient", "maybe mm process crash, try rebind service");
                e.this.bDS();
                GMTrace.o(18161134993408L, 135311);
                return;
            }
            e.this.rQv = null;
            GMTrace.o(18161134993408L, 135311);
        }
    }
}
