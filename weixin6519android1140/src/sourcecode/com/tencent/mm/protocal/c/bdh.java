package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bdh
  extends azh
{
  public int tTL;
  public float uFr;
  public int uPp;
  public azp uPq;
  public azp uPr;
  public azp uPs;
  public azp uPt;
  public azp uPu;
  public int uPv;
  public int uPw;
  public String uPx;
  public azp usU;
  public azp usV;
  public azp usW;
  
  public bdh()
  {
    GMTrace.i(3777021083648L, 28141);
    GMTrace.o(3777021083648L, 28141);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3777155301376L, 28142);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uPq == null) {
        throw new b("Not all required fields were included: SongName");
      }
      if (this.uPr == null) {
        throw new b("Not all required fields were included: SongSinger");
      }
      if (this.usV == null) {
        throw new b("Not all required fields were included: SongAlbum");
      }
      if (this.usW == null) {
        throw new b("Not all required fields were included: SongAlbumUrl");
      }
      if (this.uPs == null) {
        throw new b("Not all required fields were included: SongWifiUrl");
      }
      if (this.uPt == null) {
        throw new b("Not all required fields were included: SongWapLinkUrl");
      }
      if (this.uPu == null) {
        throw new b("Not all required fields were included: SongWebUrl");
      }
      if (this.usU == null) {
        throw new b("Not all required fields were included: SongLyric");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(2, this.tTL);
      paramVarArgs.fk(3, this.uPp);
      paramVarArgs.n(4, this.uFr);
      if (this.uPq != null)
      {
        paramVarArgs.fm(5, this.uPq.aYq());
        this.uPq.a(paramVarArgs);
      }
      if (this.uPr != null)
      {
        paramVarArgs.fm(6, this.uPr.aYq());
        this.uPr.a(paramVarArgs);
      }
      if (this.usV != null)
      {
        paramVarArgs.fm(7, this.usV.aYq());
        this.usV.a(paramVarArgs);
      }
      if (this.usW != null)
      {
        paramVarArgs.fm(8, this.usW.aYq());
        this.usW.a(paramVarArgs);
      }
      if (this.uPs != null)
      {
        paramVarArgs.fm(9, this.uPs.aYq());
        this.uPs.a(paramVarArgs);
      }
      if (this.uPt != null)
      {
        paramVarArgs.fm(10, this.uPt.aYq());
        this.uPt.a(paramVarArgs);
      }
      if (this.uPu != null)
      {
        paramVarArgs.fm(11, this.uPu.aYq());
        this.uPu.a(paramVarArgs);
      }
      if (this.usU != null)
      {
        paramVarArgs.fm(12, this.usU.aYq());
        this.usU.a(paramVarArgs);
      }
      paramVarArgs.fk(13, this.uPv);
      paramVarArgs.fk(14, this.uPw);
      if (this.uPx != null) {
        paramVarArgs.e(15, this.uPx);
      }
      GMTrace.o(3777155301376L, 28142);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.tTL) + b.a.a.a.fh(3, this.uPp) + (b.a.a.b.b.a.cK(4) + 4);
      paramInt = i;
      if (this.uPq != null) {
        paramInt = i + b.a.a.a.fj(5, this.uPq.aYq());
      }
      i = paramInt;
      if (this.uPr != null) {
        i = paramInt + b.a.a.a.fj(6, this.uPr.aYq());
      }
      paramInt = i;
      if (this.usV != null) {
        paramInt = i + b.a.a.a.fj(7, this.usV.aYq());
      }
      i = paramInt;
      if (this.usW != null) {
        i = paramInt + b.a.a.a.fj(8, this.usW.aYq());
      }
      paramInt = i;
      if (this.uPs != null) {
        paramInt = i + b.a.a.a.fj(9, this.uPs.aYq());
      }
      i = paramInt;
      if (this.uPt != null) {
        i = paramInt + b.a.a.a.fj(10, this.uPt.aYq());
      }
      paramInt = i;
      if (this.uPu != null) {
        paramInt = i + b.a.a.a.fj(11, this.uPu.aYq());
      }
      i = paramInt;
      if (this.usU != null) {
        i = paramInt + b.a.a.a.fj(12, this.usU.aYq());
      }
      i = i + b.a.a.a.fh(13, this.uPv) + b.a.a.a.fh(14, this.uPw);
      paramInt = i;
      if (this.uPx != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.uPx);
      }
      GMTrace.o(3777155301376L, 28142);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uPq == null) {
        throw new b("Not all required fields were included: SongName");
      }
      if (this.uPr == null) {
        throw new b("Not all required fields were included: SongSinger");
      }
      if (this.usV == null) {
        throw new b("Not all required fields were included: SongAlbum");
      }
      if (this.usW == null) {
        throw new b("Not all required fields were included: SongAlbumUrl");
      }
      if (this.uPs == null) {
        throw new b("Not all required fields were included: SongWifiUrl");
      }
      if (this.uPt == null) {
        throw new b("Not all required fields were included: SongWapLinkUrl");
      }
      if (this.uPu == null) {
        throw new b("Not all required fields were included: SongWebUrl");
      }
      if (this.usU == null) {
        throw new b("Not all required fields were included: SongLyric");
      }
      GMTrace.o(3777155301376L, 28142);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bdh localbdh = (bdh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3777155301376L, 28142);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 2: 
        localbdh.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 3: 
        localbdh.uPp = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 4: 
        localbdh.uFr = ((b.a.a.a.a)localObject1).yqV.readFloat();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.uPq = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.uPr = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.usV = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.usW = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.uPs = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.uPt = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.uPu = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbdh.usU = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 13: 
        localbdh.uPv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      case 14: 
        localbdh.uPw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3777155301376L, 28142);
        return 0;
      }
      localbdh.uPx = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3777155301376L, 28142);
      return 0;
    }
    GMTrace.o(3777155301376L, 28142);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bdh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */