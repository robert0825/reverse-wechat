package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.protocal.c.azh;
import com.tencent.mm.protocal.c.es;
import java.util.LinkedList;

public final class ao
  extends azh
{
  public String lQN;
  public y lRj;
  public ae lRk;
  public h lRl;
  public ca lRm;
  public cj lRn;
  public w lRo;
  public bj lRp;
  public bi lRq;
  public bp lRr;
  public k lRs;
  public n lRt;
  public String lRu;
  public int lRv;
  public boolean lRw;
  
  public ao()
  {
    GMTrace.i(12646396985344L, 94223);
    GMTrace.o(12646396985344L, 94223);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(12646531203072L, 94224);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.lRj != null)
      {
        paramVarArgs.fm(2, this.lRj.aYq());
        this.lRj.a(paramVarArgs);
      }
      if (this.lRk != null)
      {
        paramVarArgs.fm(3, this.lRk.aYq());
        this.lRk.a(paramVarArgs);
      }
      if (this.lQN != null) {
        paramVarArgs.e(4, this.lQN);
      }
      if (this.lRl != null)
      {
        paramVarArgs.fm(5, this.lRl.aYq());
        this.lRl.a(paramVarArgs);
      }
      if (this.lRm != null)
      {
        paramVarArgs.fm(6, this.lRm.aYq());
        this.lRm.a(paramVarArgs);
      }
      if (this.lRn != null)
      {
        paramVarArgs.fm(7, this.lRn.aYq());
        this.lRn.a(paramVarArgs);
      }
      if (this.lRo != null)
      {
        paramVarArgs.fm(8, this.lRo.aYq());
        this.lRo.a(paramVarArgs);
      }
      if (this.lRp != null)
      {
        paramVarArgs.fm(9, this.lRp.aYq());
        this.lRp.a(paramVarArgs);
      }
      if (this.lRq != null)
      {
        paramVarArgs.fm(10, this.lRq.aYq());
        this.lRq.a(paramVarArgs);
      }
      if (this.lRr != null)
      {
        paramVarArgs.fm(11, this.lRr.aYq());
        this.lRr.a(paramVarArgs);
      }
      if (this.lRs != null)
      {
        paramVarArgs.fm(12, this.lRs.aYq());
        this.lRs.a(paramVarArgs);
      }
      if (this.lRt != null)
      {
        paramVarArgs.fm(13, this.lRt.aYq());
        this.lRt.a(paramVarArgs);
      }
      if (this.lRu != null) {
        paramVarArgs.e(14, this.lRu);
      }
      paramVarArgs.fk(15, this.lRv);
      paramVarArgs.ah(16, this.lRw);
      GMTrace.o(12646531203072L, 94224);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.lRj != null) {
        paramInt = i + b.a.a.a.fj(2, this.lRj.aYq());
      }
      i = paramInt;
      if (this.lRk != null) {
        i = paramInt + b.a.a.a.fj(3, this.lRk.aYq());
      }
      paramInt = i;
      if (this.lQN != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lQN);
      }
      i = paramInt;
      if (this.lRl != null) {
        i = paramInt + b.a.a.a.fj(5, this.lRl.aYq());
      }
      paramInt = i;
      if (this.lRm != null) {
        paramInt = i + b.a.a.a.fj(6, this.lRm.aYq());
      }
      i = paramInt;
      if (this.lRn != null) {
        i = paramInt + b.a.a.a.fj(7, this.lRn.aYq());
      }
      paramInt = i;
      if (this.lRo != null) {
        paramInt = i + b.a.a.a.fj(8, this.lRo.aYq());
      }
      i = paramInt;
      if (this.lRp != null) {
        i = paramInt + b.a.a.a.fj(9, this.lRp.aYq());
      }
      paramInt = i;
      if (this.lRq != null) {
        paramInt = i + b.a.a.a.fj(10, this.lRq.aYq());
      }
      i = paramInt;
      if (this.lRr != null) {
        i = paramInt + b.a.a.a.fj(11, this.lRr.aYq());
      }
      paramInt = i;
      if (this.lRs != null) {
        paramInt = i + b.a.a.a.fj(12, this.lRs.aYq());
      }
      i = paramInt;
      if (this.lRt != null) {
        i = paramInt + b.a.a.a.fj(13, this.lRt.aYq());
      }
      paramInt = i;
      if (this.lRu != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.lRu);
      }
      i = b.a.a.a.fh(15, this.lRv);
      int j = b.a.a.b.b.a.cK(16);
      GMTrace.o(12646531203072L, 94224);
      return paramInt + i + (j + 1);
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
      GMTrace.o(12646531203072L, 94224);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ao localao = (ao)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(12646531203072L, 94224);
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
          localao.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new y();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((y)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRj = ((y)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ae();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ae)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRk = ((ae)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 4: 
        localao.lQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new h();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((h)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRl = ((h)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 6: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ca();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ca)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRm = ((ca)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 7: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new cj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((cj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRn = ((cj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new w();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((w)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRo = ((w)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 9: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRp = ((bj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bi();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bi)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRq = ((bi)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 11: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRr = ((bp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new k();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRs = ((k)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 13: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new n();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((n)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localao.lRt = ((n)localObject1);
          paramInt += 1;
        }
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 14: 
        localao.lRu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(12646531203072L, 94224);
        return 0;
      case 15: 
        localao.lRv = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(12646531203072L, 94224);
        return 0;
      }
      localao.lRw = ((b.a.a.a.a)localObject1).csU();
      GMTrace.o(12646531203072L, 94224);
      return 0;
    }
    GMTrace.o(12646531203072L, 94224);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */