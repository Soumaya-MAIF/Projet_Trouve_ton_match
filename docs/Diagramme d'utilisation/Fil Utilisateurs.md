# Diagramme de cas d'utilisation : 

## Accueil Utilisateur

```mermaid

flowchart LR

    subgraph Application
        UC1((Connexion))
        UC2((Accueil))
        UC3((Bouton je commence ma recherche))

    end

    Actor1[Utilisateur] --> UC2
    Actor2[Porteur de projet] --> Actor1[Utilisateur]
    Actor3[Parrain] --> Actor1[Utilisateur] 
    UC2 --> UC3

    UC1 -.-> UC2
``` 

## Fil Utilisateurs

```mermaid

flowchart LR

    subgraph Application
        UC2((Consulter profils))
        UC9((Accéder au menu))
        UC10((Consulter notifications))
        UC11((Consulter messages))
        UC12((Consulter rendez-vous))
        UC13((Consulter profil))
        UC14((Accéder à la boîte à outils))
        UC15((Mon match))
        UC16((Connexion))

    end

    Actor1[Utilisateur] --> UC2
    Actor1[Utilisateur] --> UC9
    Actor2[Porteur de projet] --> Actor1[Utilisateur]
    Actor3[Parrain] --> Actor1[Utilisateur] 

    UC16 -.-> UC9
    UC16 -.-> UC2
    UC9 --> UC10
    UC9 --> UC11
    UC9 --> UC12
    UC9 --> UC13
    UC9 --> UC14
    UC9 --> UC15

```


## Fil d'un match

```mermaid

flowchart LR

    subgraph Application
        UC2((Consulter profils))
        UC3((Voir le perfect match))
        UC4((Appuyer sur bouton match))
        UC5((Recevoir notification de match))
        UC6((Envoyer message après match))
        UC7((Supprimer le match))
        UC8((Enregistrer date de rendez-vous))
    
        UC15((Connexion))

    end
    

    Actor1[Porteur de projet] --> Actor2[Utilisateur]
    Actor3[Parrain] --> Actor2[Utilisateur]
    Actor2[Utilisateur] --> UC3
    
    UC3 --> UC4
    UC2 --> UC4
    UC4 -.-> UC5
    UC5 --> UC6
    UC5 -. << Extend >> .->  UC7
    UC6 --> UC8
    UC15 -.-> UC2
    UC15 -.-> UC3
```

## Fil Message

```mermaid

flowchart LR

    subgraph Application
        UC1((Connexion))
        UC2((Consultation de la messagerie))
        UC3((Ouvrir un message))
        UC4((Repondre à un message))
        UC5((Envoyer un message))
        UC6((Suppression d'un message))
    

    end

    Actor1[Utilisateur] --> UC2
    Actor2[Porteur de projet] --> Actor1[Utilisateur]
    Actor3[Parrain] --> Actor1[Utilisateur] 
    UC2 --> UC3
    UC3 --> UC4
    UC2 --> UC5
    UC3 --> UC6
    UC1 -.-> UC2
```

## Fil Notification

```mermaid

flowchart LR

    subgraph Application
        UC1((Connexion))
        UC2((Consultation des notification))
        UC3((Ouvrir une notification))
        UC4((Suppression d'une notification))

    end

    Actor1[Utilisateur] --> UC2
    Actor2[Porteur de projet] --> Actor1[Utilisateur]
    Actor3[Parrain] --> Actor1[Utilisateur] 
    UC2 --> UC3
    UC2 --> UC4
    UC1 -.-> UC2
```
## Fil Profil

```mermaid

flowchart LR

    subgraph Application
        UC1((Connexion))
        UC2((Profil))
        UC3((Modification du profil))
        UC4((Suppression du profil))

    end

    Actor1[Utilisateur] --> UC2
    Actor2[Porteur de projet] --> Actor1[Utilisateur]
    Actor3[Parrain] --> Actor1[Utilisateur] 
    UC2 --> UC3
    UC2 --> UC4
    UC1 -.-> UC2
``` 

## Fil Consultation d'un profil

```mermaid

flowchart LR

    subgraph Application
        UC1((Connexion))
        UC2((Profil))
        UC3((ajouter un like))
        UC4((supprimer un like))

    end

    Actor1[Utilisateur] --> UC2
    Actor2[Porteur de projet] --> Actor1[Utilisateur]
    Actor3[Parrain] --> Actor1[Utilisateur] 
    UC2 --> UC3
    UC1 -.-> UC2
    UC2 --> UC4
``` 

## Fil Boite à outils

```mermaid

flowchart LR

    subgraph Application
        UC1((Connexion))
        UC2((Menu))
        UC3((Boite a outils))
        UC4((Ouvrir un element))
        UC5((Supprimer un element))
        UC6((Telecharger un element))
        
      

    end

    Actor1[Utilisateur] --> UC2
    Actor2[Porteur de projet] --> Actor1[Utilisateur]
    Actor3[Parrain] --> Actor1[Utilisateur] 
    UC1 -.-> UC2
    UC2 --> UC3
    UC3 --> UC4
    UC3 --> UC5
    UC3 --> UC6
```   


