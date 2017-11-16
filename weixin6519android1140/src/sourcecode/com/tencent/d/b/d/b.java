package com.tencent.d.b.d;

import com.tencent.d.a.c.e;
import com.tencent.d.a.c.f;
import com.tencent.d.b.f.g;

public final class b
{
  public String yaA = "";
  public boolean yaB = false;
  public boolean yaC = false;
  private a yaD = null;
  private boolean yaE = false;
  public int yaz = 0;
  
  public b(int paramInt, String paramString, boolean paramBoolean1, boolean paramBoolean2, a parama)
  {
    this.yaz = paramInt;
    this.yaA = paramString;
    this.yaB = paramBoolean1;
    this.yaC = paramBoolean2;
    this.yaD = parama;
  }
  
  public final void a(e parame)
  {
    if ((this.yaD != null) && (!this.yaE))
    {
      if (parame == null) {
        break label60;
      }
      if (!parame.isSuccess()) {
        break label40;
      }
      this.yaD.onSuccess();
    }
    for (;;)
    {
      this.yaE = true;
      return;
      label40:
      this.yaD.onError(parame.errCode, parame.eAR);
      continue;
      label60:
      this.yaD.onError(-1, "unknown");
    }
  }
  
  public final void cpN()
  {
    g.cpU().v(new Runnable()
    {
      public final void run()
      {
        Object localObject = b.this;
        if ((((b)localObject).yaz & 0x1) != 1) {
          if ((((b)localObject).yaz & 0x2) == 2)
          {
            if (!f.nm(((b)localObject).yaA)) {
              break label99;
            }
            com.tencent.d.a.c.c.e("Soter.SoterKeyGenerateEngine", "soter: not pass auth key name", new Object[0]);
            localObject = new com.tencent.d.b.a.c(1, "auth key name not specified");
            if (((com.tencent.d.b.a.c)localObject).isSuccess()) {
              break label111;
            }
            b.this.a((e)localObject);
          }
        }
        label99:
        label111:
        do
        {
          return;
          com.tencent.d.a.c.c.e("Soter.SoterKeyGenerateEngine", "soter: not specified purpose", new Object[0]);
          localObject = new com.tencent.d.b.a.c(7, "not specified purpose. did you for get to call markGenAppSecureKey or/and markGenAuthKey?");
          break;
          localObject = new com.tencent.d.b.a.c(0);
          break;
          if (!com.tencent.d.a.a.cpw())
          {
            com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: native not support soter", new Object[0]);
            b.this.a(new com.tencent.d.b.a.c(2));
            return;
          }
          if ((b.this.yaz & 0x1) == 1)
          {
            com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: require generate ask. start gen", new Object[0]);
            if ((b.this.yaB) && (com.tencent.d.a.a.cpz()))
            {
              com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: request regen ask. remove former one", new Object[0]);
              localObject = com.tencent.d.a.a.cpy();
              if (!((e)localObject).isSuccess())
              {
                com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: remove ask failed: %s", new Object[] { ((e)localObject).eAR });
                b.this.a((e)localObject);
                return;
              }
            }
            localObject = com.tencent.d.a.a.cpx();
            if (!((e)localObject).isSuccess())
            {
              com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: generate ask failed: %s", new Object[] { ((e)localObject).eAR });
              com.tencent.d.a.a.cpy();
              b.this.a((e)localObject);
              return;
            }
            com.tencent.d.a.c.c.i("Soter.SoterKeyGenerateEngine", "soter: generate ask success!", new Object[0]);
            b.this.a((e)localObject);
          }
        } while ((b.this.yaz & 0x2) != 2);
        com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: require generate auth key. start gen: %s", new Object[] { b.this.yaA });
        if (!com.tencent.d.a.a.cpz())
        {
          com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: no ask.", new Object[0]);
          b.this.a(new com.tencent.d.b.a.c(3, "ASK not exists when generate auth key"));
          return;
        }
        if ((b.this.yaC) && (com.tencent.d.a.a.Ys(b.this.yaA)))
        {
          com.tencent.d.a.c.c.d("Soter.SoterKeyGenerateEngine", "soter: request regen auth key. remove former one", new Object[0]);
          localObject = com.tencent.d.a.a.bk(b.this.yaA, false);
          if (!((e)localObject).isSuccess())
          {
            com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: remove auth key %s, failed: %s", new Object[] { b.this.yaA, ((e)localObject).eAR });
            b.this.a((e)localObject);
            return;
          }
        }
        localObject = com.tencent.d.a.a.Yr(b.this.yaA);
        if (!((e)localObject).isSuccess())
        {
          com.tencent.d.a.c.c.w("Soter.SoterKeyGenerateEngine", "soter: generate auth key %s failed: %s", new Object[] { b.this.yaA, ((e)localObject).eAR });
          com.tencent.d.a.a.bk(b.this.yaA, true);
          b.this.a((e)localObject);
          return;
        }
        com.tencent.d.a.c.c.i("Soter.SoterKeyGenerateEngine", "soter: generate auth key success!", new Object[0]);
        b.this.a((e)localObject);
      }
    });
  }
  
  public static final class a
  {
    public String yaA = "";
    public boolean yaB = false;
    public boolean yaC = false;
    public a yaD = null;
    public int yaz = 0;
    
    public final b cpO()
    {
      return new b(this.yaz, this.yaA, this.yaB, this.yaC, this.yaD);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\d\b\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */