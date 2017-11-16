package com.tencent.mm.plugin.exdevice.e;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class a
  extends i
{
  public String jhm;
  public b kBa;
  public int kBb;
  public int kBc;
  public int kBd;
  public b kBe;
  public b kBf;
  public String kBg;
  public String kBh;
  
  public a()
  {
    GMTrace.i(11109872435200L, 82775);
    GMTrace.o(11109872435200L, 82775);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(11110006652928L, 82776);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.kBA != null)
      {
        paramVarArgs.fm(1, this.kBA.aYq());
        this.kBA.a(paramVarArgs);
      }
      if (this.kBa != null) {
        paramVarArgs.b(2, this.kBa);
      }
      paramVarArgs.fk(3, this.kBb);
      paramVarArgs.fk(4, this.kBc);
      paramVarArgs.fk(5, this.kBd);
      if (this.kBe != null) {
        paramVarArgs.b(6, this.kBe);
      }
      if (this.kBf != null) {
        paramVarArgs.b(7, this.kBf);
      }
      if (this.kBg != null) {
        paramVarArgs.e(10, this.kBg);
      }
      if (this.kBh != null) {
        paramVarArgs.e(11, this.kBh);
      }
      if (this.jhm != null) {
        paramVarArgs.e(12, this.jhm);
      }
      GMTrace.o(11110006652928L, 82776);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.kBA != null) {
        paramInt = b.a.a.a.fj(1, this.kBA.aYq()) + 0;
      }
      i = paramInt;
      if (this.kBa != null) {
        i = paramInt + b.a.a.a.a(2, this.kBa);
      }
      i = i + b.a.a.a.fh(3, this.kBb) + b.a.a.a.fh(4, this.kBc) + b.a.a.a.fh(5, this.kBd);
      paramInt = i;
      if (this.kBe != null) {
        paramInt = i + b.a.a.a.a(6, this.kBe);
      }
      i = paramInt;
      if (this.kBf != null) {
        i = paramInt + b.a.a.a.a(7, this.kBf);
      }
      paramInt = i;
      if (this.kBg != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.kBg);
      }
      i = paramInt;
      if (this.kBh != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.kBh);
      }
      paramInt = i;
      if (this.jhm != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.jhm);
      }
      GMTrace.o(11110006652928L, 82776);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = i.a(paramVarArgs); paramInt > 0; paramInt = i.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(11110006652928L, 82776);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      a locala = (a)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      case 8: 
      case 9: 
      default: 
        GMTrace.o(11110006652928L, 82776);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, i.a((b.a.a.a.a)localObject2))) {}
          locala.kBA = ((d)localObject1);
          paramInt += 1;
        }
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 2: 
        locala.kBa = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 3: 
        locala.kBb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 4: 
        locala.kBc = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 5: 
        locala.kBd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 6: 
        locala.kBe = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 7: 
        locala.kBf = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 10: 
        locala.kBg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      case 11: 
        locala.kBh = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(11110006652928L, 82776);
        return 0;
      }
      locala.jhm = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(11110006652928L, 82776);
      return 0;
    }
    GMTrace.o(11110006652928L, 82776);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */