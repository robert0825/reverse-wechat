package com.tencent.mm.protocal;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.r;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.es;
import com.tencent.mm.protocal.c.mk;
import com.tencent.mm.protocal.c.ml;
import com.tencent.mm.protocal.c.ri;
import com.tencent.mm.protocal.c.rj;
import com.tencent.mm.protocal.c.rk;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class q
{
  public static final class a
    extends k.d
    implements k.b
  {
    public final rj tKH;
    
    public a()
    {
      GMTrace.i(4085453422592L, 30439);
      this.tKH = new rj();
      dp(0);
      this.tKH.uhS = new ri();
      this.tKH.uhS.uhQ = new mk();
      this.tKH.uhR = new rk();
      GMTrace.o(4085453422592L, 30439);
    }
    
    public final byte[] Ba()
    {
      GMTrace.i(4085587640320L, 30440);
      this.tKq = ac.bOo();
      this.tKH.uhS.uNh = k.a(this);
      this.tKH.uhR.tUK = new azp().be(bg.bQN());
      this.tKp = this.tKH.uhR.tUK.uNP.toByteArray();
      this.tKo = new k.a()
      {
        public final boolean a(PByteArray paramAnonymousPByteArray, int paramAnonymousInt1, byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2, int paramAnonymousInt2)
        {
          GMTrace.i(3614483415040L, 26930);
          paramAnonymousArrayOfByte2 = (k.b)jdField_this;
          long l = jdField_this.tKi;
          if ((com.tencent.mm.sdk.a.b.bPq()) && (l == 0L)) {
            l = d.tJB;
          }
          for (;;)
          {
            ac localac = jdField_this.tKq;
            if (paramAnonymousInt1 == 722)
            {
              w.e("MicroMsg.MMEncryptCheckResUpdate", "MMEncryptCheckResUpdate reqToBuf rsaReqData");
              rj localrj = ((q.a)jdField_this).tKH;
              Object localObject = r.a(l, localrj.uhR, localrj.uhS);
              if (localObject == null)
              {
                GMTrace.o(3614483415040L, 26930);
                return false;
              }
              localrj = localObject[0];
              localObject = localObject[1];
              if (MMProtocalJni.packHybrid(paramAnonymousPByteArray, paramAnonymousArrayOfByte1, jdField_this.tKl, (int)l, paramAnonymousArrayOfByte2.Bb(), localac.ver, localrj, (byte[])localObject, localac.tLb.getBytes(), localac.tLc.getBytes(), jdField_this.tKp, paramAnonymousInt2))
              {
                w.d("MicroMsg.MMEncryptCheckResUpdate", "IRemoteReqDelegate reqToBuf packHybrid using protobuf ok, len:%d, flag:%d", new Object[] { Integer.valueOf(paramAnonymousPByteArray.value.length), Integer.valueOf(paramAnonymousInt2) });
                GMTrace.o(3614483415040L, 26930);
                return true;
              }
            }
            GMTrace.o(3614483415040L, 26930);
            return false;
          }
        }
      };
      byte[] arrayOfByte = this.tKH.toByteArray();
      GMTrace.o(4085587640320L, 30440);
      return arrayOfByte;
    }
    
    public final int Bb()
    {
      GMTrace.i(4085721858048L, 30441);
      GMTrace.o(4085721858048L, 30441);
      return 722;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    public final ml tKK;
    
    public b()
    {
      GMTrace.i(3610993754112L, 26904);
      this.tKK = new ml();
      GMTrace.o(3610993754112L, 26904);
    }
    
    public final int y(byte[] paramArrayOfByte)
    {
      GMTrace.i(3611127971840L, 26905);
      this.tKK.aD(paramArrayOfByte);
      int i = this.tKK.uND.tST;
      GMTrace.o(3611127971840L, 26905);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */