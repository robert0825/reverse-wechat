package com.tencent.mm.platformtools;

import com.tencent.gmtrace.GMTrace;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class r
{
  public static boolean hjA;
  public static boolean hjB;
  public static boolean hjC;
  public static boolean hjD;
  public static boolean hjE;
  public static boolean hjF;
  public static boolean hjG;
  public static boolean hjH;
  public static boolean hjI;
  public static String hjJ;
  public static boolean hjK;
  public static boolean hjL;
  public static boolean hjM;
  public static boolean hjN;
  public static int hjO;
  public static boolean hjP;
  public static boolean hjQ;
  public static boolean hjR;
  public static String hjS;
  public static String hjT;
  public static boolean hjU;
  public static boolean hjV;
  public static boolean hjW;
  public static boolean hjX;
  public static boolean hjY;
  public static boolean hjZ;
  public static boolean hjx;
  public static boolean hjy;
  public static boolean hjz;
  public static boolean hkA;
  public static int hkB;
  public static boolean hkC;
  public static boolean hkD;
  public static boolean hkE;
  public static boolean hkF;
  public static boolean hkG;
  public static boolean hkH;
  public static boolean hkI;
  public static boolean hkJ;
  public static boolean hkK;
  public static String hkL;
  public static int hkM;
  public static boolean hkN;
  public static boolean hkO;
  public static int hkP;
  public static boolean hkQ;
  public static String hkR;
  public static boolean hkS;
  public static boolean hkT;
  public static int hkU;
  public static int hkV;
  public static boolean hkW;
  public static String hkX;
  public static String hkY;
  public static boolean hkZ;
  public static boolean hka;
  public static int hkb;
  public static int hkc;
  public static boolean hkd;
  public static String hke;
  public static String hkf;
  public static boolean hkg;
  public static boolean hkh;
  public static int hki;
  public static int hkj;
  public static int hkk;
  public static String hkl;
  public static String hkm;
  public static String hkn;
  public static String hko;
  public static boolean hkp;
  public static boolean hkq;
  public static boolean hkr;
  public static boolean hks;
  public static String hkt;
  public static String hku;
  public static String hkv;
  public static String hkw;
  public static String hkx;
  public static boolean hky;
  public static boolean hkz;
  public static boolean hla;
  public static String hlb;
  public static String hlc;
  public static boolean hld;
  public static boolean hle;
  public static boolean hlf;
  public static boolean hlg;
  private static HashMap<Integer, ConcurrentLinkedQueue<Integer>> hlh;
  public static boolean hli;
  public static boolean hlj;
  public static boolean hlk;
  public static double lat;
  public static double lng;
  
  static
  {
    GMTrace.i(13453313966080L, 100235);
    hjx = false;
    hjy = false;
    hjz = false;
    hjA = false;
    hjB = false;
    hjC = false;
    hjD = false;
    hjE = false;
    hjF = false;
    hjG = false;
    hjH = false;
    hjI = false;
    hjJ = "";
    hjK = false;
    hjL = false;
    hjM = false;
    hjN = false;
    hjO = 0;
    hjP = false;
    hjQ = false;
    hjR = false;
    hjS = "";
    hjT = "";
    hjU = false;
    hjV = false;
    hjW = false;
    hjX = false;
    hjY = false;
    hjZ = false;
    hka = false;
    hkb = 0;
    hkc = 0;
    hkd = false;
    hke = null;
    hkf = null;
    hkg = false;
    hkh = false;
    hki = 0;
    hkj = 0;
    hkk = 0;
    hkl = "";
    hkm = "";
    hkn = null;
    hko = null;
    hkp = false;
    hkq = false;
    hkr = false;
    hks = false;
    lat = 0.0D;
    lng = 0.0D;
    hkt = "";
    hku = "";
    hkv = "";
    hkw = "";
    hkx = "";
    hky = false;
    hkz = false;
    hkA = false;
    hkB = 0;
    hkC = false;
    hkD = false;
    hkE = false;
    hkF = false;
    hkG = false;
    hkH = false;
    hkI = true;
    hkJ = false;
    hkK = false;
    hkL = "";
    hkM = 0;
    hkN = false;
    hkO = false;
    hkP = -1;
    hkQ = false;
    hkR = "";
    hkS = false;
    hkT = false;
    hkU = 5;
    hkV = 0;
    hkW = false;
    hkX = "";
    hkY = "";
    hkZ = false;
    hla = false;
    hlb = "";
    hlc = "";
    hld = false;
    hle = false;
    hlf = false;
    hlg = false;
    hlh = new HashMap();
    hli = false;
    hlj = false;
    hlk = false;
    GMTrace.o(13453313966080L, 100235);
  }
  
  public static void bf(int paramInt1, int paramInt2)
  {
    GMTrace.i(13453179748352L, 100234);
    synchronized (hlh)
    {
      ConcurrentLinkedQueue localConcurrentLinkedQueue2 = (ConcurrentLinkedQueue)hlh.get(Integer.valueOf(paramInt1));
      ConcurrentLinkedQueue localConcurrentLinkedQueue1 = localConcurrentLinkedQueue2;
      if (localConcurrentLinkedQueue2 == null)
      {
        localConcurrentLinkedQueue1 = new ConcurrentLinkedQueue();
        hlh.put(Integer.valueOf(paramInt1), localConcurrentLinkedQueue1);
      }
      localConcurrentLinkedQueue1.add(Integer.valueOf(paramInt2));
      GMTrace.o(13453179748352L, 100234);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\platformtools\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */