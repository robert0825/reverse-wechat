package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class add
  extends azh
{
  public int jWs;
  public String jWt;
  public String utd;
  public String ute;
  public String utf;
  public String utg;
  public String uth;
  public boolean uti;
  public String utj;
  public long utk;
  public boolean utl;
  public boolean utm;
  public boolean utn;
  public String uto;
  public String utp;
  public String utq;
  public String utr;
  public boolean uts;
  public LinkedList<String> utt;
  
  public add()
  {
    GMTrace.i(3861041381376L, 28767);
    this.utt = new LinkedList();
    GMTrace.o(3861041381376L, 28767);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3861175599104L, 28768);
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
      paramVarArgs.fk(2, this.jWs);
      if (this.jWt != null) {
        paramVarArgs.e(3, this.jWt);
      }
      if (this.utd != null) {
        paramVarArgs.e(4, this.utd);
      }
      if (this.ute != null) {
        paramVarArgs.e(5, this.ute);
      }
      if (this.utf != null) {
        paramVarArgs.e(6, this.utf);
      }
      if (this.utg != null) {
        paramVarArgs.e(7, this.utg);
      }
      if (this.uth != null) {
        paramVarArgs.e(8, this.uth);
      }
      paramVarArgs.ah(9, this.uti);
      if (this.utj != null) {
        paramVarArgs.e(10, this.utj);
      }
      paramVarArgs.T(11, this.utk);
      paramVarArgs.ah(12, this.utl);
      paramVarArgs.ah(13, this.utm);
      paramVarArgs.ah(14, this.utn);
      if (this.uto != null) {
        paramVarArgs.e(15, this.uto);
      }
      if (this.utp != null) {
        paramVarArgs.e(16, this.utp);
      }
      if (this.utq != null) {
        paramVarArgs.e(17, this.utq);
      }
      if (this.utr != null) {
        paramVarArgs.e(18, this.utr);
      }
      paramVarArgs.ah(19, this.uts);
      paramVarArgs.d(20, 1, this.utt);
      GMTrace.o(3861175599104L, 28768);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uND != null) {
        paramInt = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.jWs);
      paramInt = i;
      if (this.jWt != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.jWt);
      }
      i = paramInt;
      if (this.utd != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.utd);
      }
      paramInt = i;
      if (this.ute != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.ute);
      }
      i = paramInt;
      if (this.utf != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.utf);
      }
      paramInt = i;
      if (this.utg != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.utg);
      }
      i = paramInt;
      if (this.uth != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uth);
      }
      i += b.a.a.b.b.a.cK(9) + 1;
      paramInt = i;
      if (this.utj != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.utj);
      }
      i = paramInt + b.a.a.a.S(11, this.utk) + (b.a.a.b.b.a.cK(12) + 1) + (b.a.a.b.b.a.cK(13) + 1) + (b.a.a.b.b.a.cK(14) + 1);
      paramInt = i;
      if (this.uto != null) {
        paramInt = i + b.a.a.b.b.a.f(15, this.uto);
      }
      i = paramInt;
      if (this.utp != null) {
        i = paramInt + b.a.a.b.b.a.f(16, this.utp);
      }
      paramInt = i;
      if (this.utq != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.utq);
      }
      i = paramInt;
      if (this.utr != null) {
        i = paramInt + b.a.a.b.b.a.f(18, this.utr);
      }
      paramInt = b.a.a.b.b.a.cK(19);
      int j = b.a.a.a.c(20, 1, this.utt);
      GMTrace.o(3861175599104L, 28768);
      return i + (paramInt + 1) + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.utt.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3861175599104L, 28768);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      add localadd = (add)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3861175599104L, 28768);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localadd.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 2: 
        localadd.jWs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 3: 
        localadd.jWt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 4: 
        localadd.utd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 5: 
        localadd.ute = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 6: 
        localadd.utf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 7: 
        localadd.utg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 8: 
        localadd.uth = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 9: 
        localadd.uti = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 10: 
        localadd.utj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 11: 
        localadd.utk = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 12: 
        localadd.utl = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 13: 
        localadd.utm = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 14: 
        localadd.utn = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 15: 
        localadd.uto = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 16: 
        localadd.utp = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 17: 
        localadd.utq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 18: 
        localadd.utr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      case 19: 
        localadd.uts = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3861175599104L, 28768);
        return 0;
      }
      localadd.utt.add(((b.a.a.a.a)localObject1).yqV.readString());
      GMTrace.o(3861175599104L, 28768);
      return 0;
    }
    GMTrace.o(3861175599104L, 28768);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\add.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */